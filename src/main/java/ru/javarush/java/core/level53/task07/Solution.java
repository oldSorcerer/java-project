package ru.javarush.java.core.level53.task07;

import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        FestivalGate gate = new FestivalGate();

        int threadsCount = 5;
        int incrementsPerThread = 100;

        Thread[] workers = new Thread[threadsCount];

        // Создаем 5 потоков, каждый увеличит счётчик 100 раз
        for (int i = 0; i < threadsCount; i++) {
            workers[i] = new Thread(() -> {
                for (int j = 0; j < incrementsPerThread; j++) {
                    gate.incrementVisitorCount(); // атомарное увеличение счётчика
                }
            });
        }

        // Запускаем все потоки
        for (Thread t : workers) {
            t.start();
        }

        // Дожидаемся завершения всех потоков (важно для корректного итогового результата)
        for (Thread t : workers) {
            t.join();
        }

        // Выводим итоговое значение (должно быть 500)
        System.out.println(gate.getVisitorCount());
    }
}