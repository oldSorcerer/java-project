package ru.javarush.java.core.level56.task03;

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
        Path path = Paths.get("input.txt");

        // Латч, чтобы не завершать программу до того, как сработает обработчик чтения
        CountDownLatch latch = new CountDownLatch(1);

        try (...) {

            // Готовим буфер на 128 байт — читаем только начало файла
            ByteBuffer buffer = ByteBuffer.allocate(128);

            // Асинхронно читаем данные с позиции 0 и обрабатываем результат через CompletionHandler
   

            // Ждём завершения асинхронной операции, чтобы приложение не завершилось раньше времени


        } catch (IOException e) {
            // Ошибка открытия файла — тоже сообщим пользователю
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        } catch (InterruptedException e) {
            // Для нашей задачи — просто восстанавливаем флаг прерывания
            Thread.currentThread().interrupt();
        }
    }
}