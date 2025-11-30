package ru.javarush.java.core.level57.task03;

public class Solution {
    // Переменная скорости, которую "главная система" постоянно обновляет.
    private static volatile int currentSpeed = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread telemetryThread = null; // Ссылка на виртуальный поток телеметрии

        // Симулируем главный цикл управления болидом (обновление скорости)
        for (int tick = 1; tick <= 5; tick++) {
            currentSpeed = 80 * tick; // эмуляция поступающих данных датчиков
            System.out.println("Главный цикл: обновлена скорость = " + currentSpeed + " км/ч");

            // В момент третьего тика запускаем модуль телеметрии
            

            // Небольшая пауза имитирует время шага главного цикла

        }

        // Перед "следующим этапом" обязательно дожидаемся завершения телеметрии
        if (telemetryThread != null) {
            telemetryThread.join(); // синхронизация с виртуальным потоком
        }

        System.out.println("Главный цикл: телеметрия завершила запись. Переходим к следующему этапу.");
    }
}