package ru.javarush.java.core.level52.task02;

public class Solution {
    public static void main(String[] args) {
        // Создаём один общий объект счётчика для всех потоков
        TeamScoreTracker tracker = new TeamScoreTracker();

        // Логика "игровой сессии": 2500 раз добавляем очко
        Runnable session = () -> {
            for (int i = 0; i < 2500; i++) {
                tracker.addPoint();
            }
        };

        // Запускаем 4 потока
        Thread[] threads = new Thread[4];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(session, "Session-" + (i + 1));
            threads[i].start();
        }

        // Дожидаемся завершения всех потоков
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // Для простоты: восстанавливаем статус прерывания и выходим из ожидания
                Thread.currentThread().interrupt();
            }
        }

        // Выводим итоговый счёт (должно быть 10000)
        System.out.println(tracker.currentTeamScore);
    }
}