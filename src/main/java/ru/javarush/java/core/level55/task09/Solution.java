package ru.javarush.java.core.level55.task09;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Solution {
    public static void main(String[] args) {

            // Имитируем получение статуса из удаленной системы с задержкой 2 секунды

        // Если результат не пришел за 1 секунду — подставляем запасное значение

        // Выводим итоговый статус (либо реальный, либо запасной)

        // Дожидаемся завершения цепочки, чтобы программа не завершилась раньше времени

    }

    // Небольшой помощник для задержки
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // Для учебного примера достаточно восстановить флаг прерывания
            Thread.currentThread().interrupt();
        }
    }
}