package ru.javarush.java.core.level58.task07;

import java.util.concurrent.locks.StampedLock;

public class Solution {
    public static void main(String[] args) {
        // Демонстрация работы кэша телеметрии
        TelemetryCache cache = new TelemetryCache();

        // Устанавливаем начальную высоту 123 (безопасная запись)
        cache.updateAltitude(123);

        // Считываем текущую высоту (безопасное чтение)
        int altitude = cache.getAltitude();

        // Ожидаемый вывод: 123
        System.out.println(altitude);
    }
}