package ru.javarush.java.core.level57.task08;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Solution {
    public static void main(String[] args) {
        // Создаем ExecutorService на виртуальных потоках.


        try {
            // Формируем список из 100 задач (операции с номерами 1..100)
            List<Callable<String>> tasks = new ArrayList<>();
            for (int i = 1; i <= 100; i++) {
                final int taskNumber = i;
                tasks.add(() -> {
                    // Каждая 15-я задача — критическая: она завершается исключением.

                });
            }

            // Запускаем все задачи сразу и ожидаем завершение каждой из них.


            // Анализируем результаты: для каждой операции проверяем, была ли ошибка.
            for (int i = 0; i < futures.size(); i++) {
                int n = i + 1; // номер задачи соответствует порядку добавления
                
                try {
                    // Получаем результат (исключения перелетают как ExecutionException)

                    System.out.println("Задача " + n + " успешно завершена");
                } catch (ExecutionException e) {
                    // Извлекаем исходную причину, чтобы вывести точный текст ошибки
                    Throwable cause = e.getCause();
                    String message = cause != null ? cause.getMessage() : e.getMessage();
                    System.out.println("Задача " + n + " провалена: " + message);
                } catch (InterruptedException ie) {
                    // Если ожидание было прервано — помечаем поток и продолжаем аудит остальных
                    Thread.currentThread().interrupt();
                    System.out.println("Задача " + n + " провалена: поток ожидания был прерван");
                }
            }
        } catch (InterruptedException e) {
            // Если прервали во время invokeAll — восстанавливаем флаг прерывания
            Thread.currentThread().interrupt();
        } finally {
            // Корректно выключаем систему управления (ExecutorService)
            
        }
    }
}