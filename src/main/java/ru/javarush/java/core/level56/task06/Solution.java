package ru.javarush.java.core.level56.task06;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.CountDownLatch;

public class Solution {

    // Размер блока чтения согласно условию
    public static final int CHUNK_SIZE = 4096;

    public static void main(String[] args) {
        Path input = Paths.get("data.txt");
        Path output = Paths.get("data_result.txt");
        CountDownLatch done = new CountDownLatch(1);

        try {
            // Открываем канал для асинхронного чтения
            AsynchronousFileChannel readChannel = AsynchronousFileChannel.open(input, StandardOpenOption.READ);

            // Декодер UTF-8. Он нам нужен, чтобы корректно читать текст (даже если многобайтные символы разбиваются между блоками)
            CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();

            // Запускаем асинхронное чтение
            ReadTask readTask = new ReadTask(readChannel, decoder, output, done);
            readTask.start();

            // Ждем окончания всей цепочки (чтение -> подсчет -> запись)
            done.await();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}