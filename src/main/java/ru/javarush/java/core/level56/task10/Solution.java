package ru.javarush.java.core.level56.task10;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.CountDownLatch;

public class Solution {
    public static void main(String[] args) {
        // Счётчик для ожидания завершения асинхронной операции
        CountDownLatch latch = new CountDownLatch(1);

        Path path = Paths.get("config.ini"); // файл конфигурации в текущей папке

        try {
            // Открываем канал для асинхронного чтения
            final AsynchronousFileChannel channel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);

            // Буфер строго на 100 байт — это гарантирует чтение не более 100 байт
            final ByteBuffer buffer = ByteBuffer.allocate(100);

            try {
                // Запускаем асинхронное чтение с позиции 0
                channel.read(buffer, 0L, buffer, new CompletionHandler<Integer, ByteBuffer>() {
                    @Override
                    public void completed(Integer bytesRead, ByteBuffer attachment) {
                        // Здесь чтение завершено (успешно), даже если прочитано меньше 100 байт

                    }

                    @Override
                    public void failed(Throwable exc, ByteBuffer attachment) {
                        // Любая ошибка чтения: закрываем канал
  
                    }
                });
            } catch (Exception e) {
                // Если не удалось запланировать чтение (ошибка при вызове read)
                try {
                    channel.close();
                } catch (IOException ignored) {
                }
                System.out.println("Операция завершена");
                latch.countDown();
            }
        } catch (IOException e) {
            // Ошибка открытия файла: не зависаем, сразу сигнализируем о завершении
            System.out.println("Операция завершена");
            latch.countDown();
        }

        // Основной поток обязательно ждёт завершения асинхронной операции
        try {
            
        } catch (InterruptedException e) {
            // Для учебной задачи просто восстанавливаем флаг прерывания
            Thread.currentThread().interrupt();
        }
    }
}