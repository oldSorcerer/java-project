package ru.javarush.java.core.level59.task07;

import java.io.RandomAccessFile;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution {
    // Размер одного региона (чанка) — 4 МБ
    private static final int CHUNK_SIZE = 4 * 1024 * 1024;

    // Индекс нужного региона: 0 — первый, 1 — второй
    private static final int REGION_INDEX = 1;

    // Сколько символов нужно прочитать
    private static final int SYMBOLS_TO_READ = 100;

    public static void main(String[] args) throws Exception {
        // Путь к файлу
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        // Работаем через RandomAccessFile и FileChannel — это необходимо для MappedByteBuffer
        try (RandomAccessFile raf = new RandomAccessFile(path, "r");
             ... ) {

            long regionOffset = (long) CHUNK_SIZE * REGION_INDEX; // начало второго региона
            long fileSize = ... 

            // Если файл слишком маленький и второй регион отсутствует — ничего не выводим
            if (fileSize <= regionOffset) {
                return;
            }

            // Размер отображаемого региона:
            // - стараемся отобразить ровно 4 МБ,
            // - но если файл короче — берём доступный хвост (не выходим за пределы файла).
            long mapSize = Math.min(CHUNK_SIZE, fileSize - regionOffset);

            // Отображаем участок файла в память


            // Декодируем байты в символы UTF-8, читаем не более 100 символов
            // Предполагаем, что файл в UTF-8. На некорректные последовательности — замена.
            CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder()
                    .onMalformedInput(CodingErrorAction.REPLACE)
                    .onUnmappableCharacter(CodingErrorAction.REPLACE);

            CharBuffer out = CharBuffer.allocate(SYMBOLS_TO_READ);

            // Декодируем столько, сколько поместится в буфер из 100 символов
            // (decode вернёт OVERFLOW, если символов больше — нам достаточно первых 100)



            // Выводим то, что удалось прочитать (если региона меньше 100 символов — выведется меньше)
            System.out.print(out.toString());
        }
    }
}