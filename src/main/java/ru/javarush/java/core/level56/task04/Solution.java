package ru.javarush.java.core.level56.task04;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.CountDownLatch;

public class Solution {
    public static void main(String[] args) {
        // Имя файла, которое одновременно будет attachment для операции
        String fileName = "async_result.txt";
        String text = "CompletionHandler example";

        Path path = Paths.get(fileName);

        // Готовим буфер с данными для записи
        final ByteBuffer buffer = ByteBuffer.wrap(text.getBytes(StandardCharsets.UTF_8));

        // Простой способ дождаться завершения асинхронной операции,
        // чтобы программа не завершилась раньше времени
        CountDownLatch done = new CountDownLatch(1);

        AsynchronousFileChannel channel;
        try {
            // Открываем файл для записи, создаём его при необходимости и очищаем, если существует
            channel = AsynchronousFileChannel.open(
                    path,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );
        } catch (IOException e) {
            // Если даже открыть файл не удалось, сообщаем об ошибке
            System.out.println("Ошибка записи в файл " + fileName + ": " + e.getMessage());
            return;
        }

        // Делаем ссылку final, чтобы использовать её внутри CompletionHandler
        final AsynchronousFileChannel finalChannel = channel;

        // Собственный обработчик результата асинхронной записи
        CompletionHandler<Integer, String> handler = new CompletionHandler<Integer, String>() {



            
        };

        // Запускаем асинхронную запись с attachment — именем файла
        finalChannel.write(buffer, 0, fileName, handler);

        // Ждем завершения операции, чтобы увидеть результат работы обработчика
        try {
            done.await();
        } catch (InterruptedException e) {
            // Если поток прервали — устанавливаем флаг и завершаем программу
            Thread.currentThread().interrupt();
        }
    }
}