package ru.javarush.java.core.level57.task07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем ExecutorService, который запускает каждую задачу в отдельном виртуальном потоке


        try {
            // Отправляем задачу на выполнение (submit возвращает Future для ожидания результата)


            // Ожидаем завершения задачи и получения ответа от виртуального потока


            // Выводим полученное сообщение на главный экран

        } finally {
            // Корректно деактивируем вычислительный модуль (останавливаем Executor)

        }
    }
}