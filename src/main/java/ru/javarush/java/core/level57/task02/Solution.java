package ru.javarush.java.core.level57.task02;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // Количество виртуальных потоков (дронов)
    private static final int DRONE_COUNT = 100_000;

    // Пауза перед стартом каждого дрона в миллисекундах
    private static final long PRELAUNCH_DELAY_MS = 500;

    public static void main(String[] args) {
        // Сохраняем ссылки на потоки, чтобы потом подождать их завершения
        List<Thread> drones = new ArrayList<>(DRONE_COUNT);

        // Запускаем 100 000 виртуальных потоков практически одновременно
        for (int i = 0; i < DRONE_COUNT; i++) {


            
        }

        // Дожидаемся завершения всех виртуальных потоков
        for (Thread drone : drones) {

        }

        // Итоговое сообщение после завершения всех виртуальных потоков
        System.out.println("Все виртуальные дроны успешно запущены и готовы к выполнению миссии!");
    }
}