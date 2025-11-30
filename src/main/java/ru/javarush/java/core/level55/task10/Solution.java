package ru.javarush.java.core.level55.task10;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class Solution {
    // Собственный пул потоков на 3 рабочих
    private static final ExecutorService executor = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        try {
            int userId = 1; // Пример: получили id пользователя (в реальном приложении — из сессии/БД)

            // 1) Асинхронно получаем имя пользователя по его id

                    // 2) Как только имя готово — сразу последовательно начинаем получать заказы (thenCompose)

                            // 3) Получаем заказы пользователя в нашем ExecutorService

                                    // 4) Накладываем тайм-аут 1 сек на получение заказов

                                    // 5) Обрабатываем тайм-аут: если случился — возвращаем пустой список
                                    //    Обработчик тоже выполняем в нашем пуле (handleAsync + executor),
                                    //    чтобы все асинхронные операции шли через кастомный ExecutorService.


                                        // Разворачиваем причину, чтобы точно проверить TimeoutException


                                        // Прочие ошибки пробрасываем дальше


            // Дожидаемся результата всей цепочки и выводим итоговый список заказов

        } finally {
            // Корректно завершаем работу пула потоков
            executor.shutdown();
        }
    }

    // Имитация асинхронного запроса к БД: возвращает имя пользователя через 1 секунду
    // Важно: выполняется в нашем кастомном ExecutorService
    static CompletableFuture<String> getUserAsync(int id) {
        return CompletableFuture.supplyAsync(() -> {
            sleep(1); // имитация задержки 1 секунда
            return "user-" + id;
        }, executor);
    }

    // Имитация асинхронного получения заказов пользователя: задержка 2 секунды
    // Важно: выполняется в нашем кастомном ExecutorService
    static CompletableFuture<List<String>> getUserOrdersAsync(String username) {
        return CompletableFuture.supplyAsync(() -> {
            sleep(2); // имитация задержки 2 секунды
            return List.of(
                    "Заказ 1 для " + username,
                    "Заказ 2 для " + username,
                    "Заказ 3 для " + username
            );
        }, executor);
    }

    // Небольшой вспомогательный метод для имитации задержек
    private static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            // В учебной задаче просто восстанавливаем флаг прерывания
            Thread.currentThread().interrupt();
        }
    }
}