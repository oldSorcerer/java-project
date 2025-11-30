package ru.javarush.java.core.level57.task06;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        final int REQUESTS = 20_000;

        // Задача клиента: имитация 2-секундной обработки
        Runnable clientTask = () -> {

        };

        // 1) Создаем все виртуальные потоки заранее (пока не запускаем)
        List<Thread> virtualThreads = new ArrayList<>(REQUESTS);
        for (int i = 0; i < REQUESTS; i++) {
            // Виртуальный поток

        }

        // 2) Запускаем все задачи практически одновременно
        for (Thread t : virtualThreads) {
            
        }

        // 3) В течение трех секунд, раз в секунду, выводим:
        //    - общее количество живых потоков в JVM
        //    - количество живых виртуальных потоков
        for (int i = 0; i < 3; i++) {
            Stats stats = snapshot();
            System.out.println("Активные потоки: " + stats.totalLive + " | Виртуальные потоки: " + stats.virtualLive);
            Thread.sleep(1_000); // строго раз в секунду
        }

        // 4) Корректно дожидаемся завершения всех 20 000 задач
        for (Thread t : virtualThreads) {
            t.join();
        }
    }

    // Снимок текущего состояния потоков во всей JVM:
    // totalLive — все живые потоки (платформенные + виртуальные),
    // virtualLive — только живые виртуальные потоки.
    private static Stats snapshot() {
        var allThreads = Thread.getAllStackTraces().keySet(); // все живые потоки JVM
        int total = allThreads.size();

        int virtualCount = 0;
        for (Thread th : allThreads) {

            
        }
        return new Stats(total, virtualCount);
    }

    // Небольшая record-структура для наглядности
    private record Stats(int totalLive, int virtualLive) {}
}