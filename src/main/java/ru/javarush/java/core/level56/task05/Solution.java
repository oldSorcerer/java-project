package ru.javarush.java.core.level56.task05;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.LongAdder;

public class Solution {
    // Размер блока чтения в байтах
    private static final int BLOCK_SIZE = 4096;
    // Запас под "хвост" недекодированных байт между блоками (UTF-8: максимум 3 байта хвоста)
    private static final int EXTRA_TAIL = 4;

    public static void main(String[] args) {
        Path path = Paths.get("big_text.txt");

        // Счётчик переводов строк. LongAdder удобен для инкремента из обработчика.
        LongAdder lineCounter = new LongAdder();

        // Декодер UTF-8 с заменой некорректных последовательностей
        CharsetDecoder decoder = StandardCharsets.UTF_8
                .newDecoder()
                .onMalformedInput(CodingErrorAction.REPLACE)
                .onUnmappableCharacter(CodingErrorAction.REPLACE);

        // Буферы: байтовый для асинхронного чтения (с запасом под хвост) и символьный для результатов декодирования
        ByteBuffer byteBuf = ByteBuffer.allocate(BLOCK_SIZE + EXTRA_TAIL);
        CharBuffer charBuf = CharBuffer.allocate(8192); // чуть больше блока, чтобы реже получать OVERFLOW

        CountDownLatch done = new CountDownLatch(1);

        try {
            AsynchronousFileChannel channel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);

            // Позиция в файле для следующего чтения
            final long[] filePos = {0L};

            // Готовим первый запрос на чтение ровно BLOCK_SIZE байт
            byteBuf.clear();
            byteBuf.limit(BLOCK_SIZE);

            CompletionHandler<Integer, Void> handler = new CompletionHandler<>() {


                
            };

            // Запускаем первое чтение
            channel.read(byteBuf, filePos[0], null, handler);

            // Ждём завершения всей асинхронной цепочки (подсчёт и чтение выполняются не в главном потоке)
            done.await();
        } catch (Exception e) {
            // В учебной задаче — краткий вывод ошибки
            e.printStackTrace();
        }
    }

    // Декодируем из byteBuf в charBuf и сразу считаем '\n' по мере появления символов
    private static void decodeAndCount(CharsetDecoder decoder,
                                       ByteBuffer byteBuf,
                                       CharBuffer charBuf,
                                       boolean endOfInput,
                                       LongAdder lineCounter) {

        while (true) {
            // Декодируем очередную порцию
            CoderResult result = decoder.decode(byteBuf, charBuf, endOfInput);
            // Считаем количество переводов строк в том, что получилось
            countNewlines(charBuf, lineCounter);

            if (result.isOverflow()) {
                // Буфер символов переполнен — освобождаем его (мы уже посчитали) и продолжаем
                continue;
            }
            // UNDERFLOW — либо вход исчерпан, либо в конце остался хвост незавершённого символа (оставим на следующий блок)
            break;
        }

        if (endOfInput) {
            // Финальный flush декодера, чтобы получить всё, что он ещё держит внутри
            CoderResult flush;
            do {
                flush = decoder.flush(charBuf);
                countNewlines(charBuf, lineCounter);
            } while (flush.isOverflow());

            decoder.reset(); // на всякий случай, чтобы декодер был в исходном состоянии
        }
    }

    // Подсчитываем '\n' в charBuf и очищаем его под следующую порцию данных
    private static void countNewlines(CharBuffer charBuf, LongAdder lineCounter) {
        charBuf.flip(); // читаем то, что было записано decode()/flush()
        for (int i = 0, n = charBuf.limit(); i < n; i++) {
            if (charBuf.get(i) == '\n') {
                lineCounter.increment();
            }
        }
        charBuf.clear();
    }

    private static void safeClose(AsynchronousFileChannel ch) {
        try {
            ch.close();
        } catch (IOException ignored) {
        }
    }
}