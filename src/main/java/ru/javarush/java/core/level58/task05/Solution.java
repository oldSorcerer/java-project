package ru.javarush.java.core.level58.task05;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Solution {
    // Количество фаз (актов) спектакля
    private static final int TOTAL_PHASES = 2;

    public static void main(String[] args) {
        // Один барьер на 3 участника: два потока + главный поток
        CyclicBarrier barrier = new CyclicBarrier(3);

        // Создаем "артистов"
        Thread actorStar = new Thread(participant("Актер-звезда", barrier));
        Thread supporting = new Thread(participant("Второй план", barrier));

        // Запускаем потоки
        actorStar.start();
        supporting.start();

        // Главный поток — "Главный режиссер"
        for (int phase = 1; phase <= TOTAL_PHASES; phase++) {
            System.out.println("Главный режиссер работает в фазе " + phase);
            try {
                // Ждем, пока оба потока тоже завершат работу в текущей фазе

            } catch (InterruptedException | BrokenBarrierException e) {
                // Для учебной задачи упростим обработку ошибок
                throw new RuntimeException(e);
            }
        }

        // Дожидаемся завершения остальных участников
        try {
            actorStar.join();
            supporting.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Объявляем об успешном завершении всех фаз
        System.out.println("Все фазы завершены!");
    }

    // Фабрика задач для участников: печатает работу в фазе и ждет остальных на барьере
    private static Runnable participant(String name, CyclicBarrier barrier) {
        return () -> {
            for (int phase = 1; phase <= TOTAL_PHASES; phase++) {
                System.out.println(name + " работает в фазе " + phase);
                try {
                    // Ждем остальных участников, чтобы перейти к следующей фазе синхронно

                } catch (InterruptedException | BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }
}