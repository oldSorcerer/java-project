package ru.javarush.java.core.level53.task02;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    // Два ReentrantLock — отдельные инструменты
    private static final ReentrantLock toolA = new ReentrantLock();
    private static final ReentrantLock toolB = new ReentrantLock();

    // Ограничение ожидания при захвате
    private static final long TIMEOUT_MS = 100;

    public static void main(String[] args) throws InterruptedException {
        // Два потока — инженеры Чарли и Дельта
        Thread charlie = new Thread(() -> {
            // Несколько попыток, чтобы нагляднее увидеть успехи/неудачи
            for (int i = 0; i < 5; i++) {
                attemptToUseBothTools("Чарли");
                try {
                    Thread.sleep(80); // короткая пауза между попытками
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Чарли");

        Thread delta = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                attemptToUseBothTools("Дельта");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Дельта");

        // Запускаем одновременно
        charlie.start();
        delta.start();

        // Дожидаемся завершения обоих
        charlie.join();
        delta.join();
    }

    // Метод, в котором инженер пытается захватить оба инструмента с таймаутом
    private static void attemptToUseBothTools(String engineerName) {




        
    }
}