package ru.javarush.java.core.level58.task03;

import java.util.concurrent.*;

// Задача: дождаться сигнала от "зонда" не более 1 секунды.
// Сигнал имитируется в отдельном потоке и приходит через 3 секунды.
public class Solution {
    public static void main(String[] args) {
        // Один рабочий поток для имитации приёма сигнала
        ExecutorService executor = Executors.newSingleThreadExecutor();

        try {
            // Запускаем отдельную задачу, которая "спит" 3 секунды и возвращает сообщение


            try {
                // Ждём результат не более 1 секунды


                // Если успели получить — печатаем статус
                if (message != null) {
                    System.out.println(message);
                } else {
                    // Случай прерывания/отмены
                    System.out.println("Время истекло!");
                }
            } catch (TimeoutException e) {
                // Не дождались — сообщаем и отменяем задачу (прервём "сон" потока)
                System.out.println("Время истекло!");

            } catch (InterruptedException | ExecutionException e) {
                // Для простоты считаем любые сбои отсутствием своевременного ответа
                System.out.println("Время истекло!");
            }
        } finally {
            // Завершим пул потоков, чтобы программа корректно завершилась
            executor.shutdownNow();
        }
    }
}