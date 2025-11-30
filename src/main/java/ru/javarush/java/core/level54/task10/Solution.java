package ru.javarush.java.core.level54.task10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {

    // Фабричный метод: создаёт задачу-измеритель длины строки
    // Используем Callable, чтобы задача возвращала результат (длину)
    private static Callable<Integer> measureLength(String text) {
        return () -> text.length(); // лямбда — краткая реализация метода call()
    }

    public static void main(String[] args) throws Exception {
        // Настраиваем пул из двух потоков — не более двух задач одновременно


        try {
            // Создаём задачи для трёх "свитков" и отправляем их в пул


            // Дожидаемся выполнения каждой задачи и получаем её результат через Future


            // Фиксируем (печатаем) итоговые измерения
            System.out.println("Java -> " + len1);
            System.out.println("Concurrency -> " + len2);
            System.out.println("Best Practices -> " + len3);
        } finally {
            // Корректно завершаем работу пула потоков
            pool.shutdown();
        }
    }
}