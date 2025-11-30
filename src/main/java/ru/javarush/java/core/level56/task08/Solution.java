package ru.javarush.java.core.level56.task08;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Пути к файлам-журналам
        Path path1 = Paths.get("file1.txt");
        Path path2 = Paths.get("file2.txt");

        // Открываем отдельные асинхронные каналы для каждого файла
        AsynchronousFileChannel ch1 = AsynchronousFileChannel.open(path1, StandardOpenOption.READ);
        AsynchronousFileChannel ch2 = AsynchronousFileChannel.open(path2, StandardOpenOption.READ);

        // Буферы для чтения (один буфер на каждую операцию через CompletionHandler)
        ByteBuffer buf1 = ByteBuffer.allocate(4096);
        ByteBuffer buf2 = ByteBuffer.allocate(4096);

        // Синхронизация завершения двух операций (по одному CompletionHandler на файл)
        CountDownLatch latch = new CountDownLatch(2);

        // Планировщик для отложенной попытки отмены Future (через 50 мс)
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        //  Инициируем чтение и обрабатываем результат через CompletionHandler.
        ch1.read(buf1, 0L, "file1.txt", new CompletionHandler<Integer, String>() {


        });


        //Инициируем чтение через CompletionHandler.
        // Отдельный буфер только для Future-операции (чтобы не пересекаться с handler-буфером)
        ByteBuffer futureBuf = ByteBuffer.allocate(4096);

        // Запускаем параллельную операцию чтения (специально для получения Future)
        Future<Integer> futureForCancel = ch2.read(futureBuf, 0L);

        // Пытаемся отменить Future через 50 мс.
        scheduler.schedule(() -> {
            // Если операция ещё не завершена, cancel попытается её отменить
            futureForCancel.cancel(true);
        }, 50, TimeUnit.MILLISECONDS);

        // Основная операция чтения file2.txt — через CompletionHandler
        ch2.read(buf2, 0L, "file2.txt", new CompletionHandler<Integer, String>() {
            @Override
            public void completed(Integer bytesRead, String filename) {
                // Здесь мы пытаемся "наблюдать" результат Future, который выше мы отменяем через 50 мс.
                // Если отмена сработает — future.get() выбросит CancellationException.

            }

            @Override
            public void failed(Throwable exc, String filename) {
                // Если провайдер AsynchronousFileChannel в случае отмены передаст CancellationException сюда,
                // обработаем этот вариант особым образом (сообщение про отмену).

            }
        });

        // Ждем завершения обеих handler-операций (успех/ошибка/обработка отмены)
        latch.await();

        // Освобождаем ресурсы
        try {
            ch1.close();
        } catch (IOException ignored) {
        }
        try {
            ch2.close();
        } catch (IOException ignored) {
        }
        scheduler.shutdownNow();
    }
}