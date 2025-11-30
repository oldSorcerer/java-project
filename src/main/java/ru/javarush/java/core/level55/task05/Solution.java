package ru.javarush.java.core.level55.task05;

import java.util.concurrent.CompletableFuture;

public class Solution {
    public static void main(String[] args) {
        // Создаем три независимые асинхронные задачи.
        // Каждая задача имитирует доставку груза и возвращает свой уникальный идентификатор.



        // Ждем завершения всех трех задач через централизованное ожидание allOf


        // Получаем результаты из каждого CompletableFuture и печатаем их в нужном порядке


        System.out.println(a + " " + b + " " + c);
    }

    // Небольшой помощник для имитации задержки выполнения
    private static void pause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // В нашем примере просто восстанавливаем флаг прерывания
            Thread.currentThread().interrupt();
        }
    }
}