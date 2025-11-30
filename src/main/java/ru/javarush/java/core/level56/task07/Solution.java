package ru.javarush.java.core.level56.task07;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Открываем файл для асинхронного чтения
        Path file = Paths.get("largefile.txt");
        try (AsynchronousFileChannel channel = AsynchronousFileChannel.open(file, StandardOpenOption.READ)) {

            // Буфер для чтения (размер произвольный — нам важно запустить операцию)
            ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024); // 1 МБ

            // Запускаем асинхронное чтение: метод read вернет Future<Integer>


            // Имитируем быстрое решение пользователя — подождем всего 100 мс
            Thread.sleep(100);

            // Пытаемся отменить операцию чтения


            // Проверяем, что операция действительно отменена:
            // попытка получить результат должна выбросить CancellationException

        }
    }
}