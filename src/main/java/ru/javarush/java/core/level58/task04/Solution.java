package ru.javarush.java.core.level58.task04;

import java.time.Duration;
import java.time.Instant;

public class Solution {
    // Длительности этапов в миллисекундах (строго по условию)
    private static final long SCANNING_MS = 500;  // Сканирование угроз
    private static final long ISOLATION_MS = 800; // Изоляция системы
    private static final long CLEANUP_MS = 900;   // Очистка данных

    public static void main(String[] args) throws InterruptedException {
        // Устанавливаем дедлайн миссии на 2 секунды от текущего момента
        Instant missionDeadline = Instant.now().plusSeconds(2);

        // Запускаем сценарий с заданным абсолютным дедлайном
        performMission(missionDeadline);
    }

    // Функция принимает абсолютное время дедлайна (missionDeadline)
    public static void performMission(Instant missionDeadline) throws InterruptedException {
        // Перед началом каждого этапа проверяем, хватит ли времени до дедлайна

        // Эмулируем выполнение этапа через sleep



        // Если все три этапа успели стартовать при достаточном запасе времени и завершились
        System.out.println("Все операции выполнены вовремя");
    }

    // Вспомогательная проверка: хватает ли времени до дедлайна для выполнения этапа
    private static boolean hasTime(long stageMillis, Instant deadline) {
        // Сколько миллисекунд осталось до дедлайна на текущий момент
        long remaining = Duration.between(Instant.now(), deadline).toMillis();
        // Достаточно, если можем уложиться ровно к дедлайну или раньше (>=)
        return remaining >= stageMillis;
    }
}