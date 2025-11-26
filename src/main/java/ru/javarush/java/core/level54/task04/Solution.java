package ru.javarush.java.core.level54.task04;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаём пул из 2 потоков — два "мощных вычислительных блока"


        try {
            // Задача с возвратом результата: имитируем сложные вычисления и возвращаем 42

            // Отправляем задачу на выполнение и получаем Future


            // Получаем результат вычисления через Future.get()


            // Фиксируем предсказание (можно вывести на экран)

        } finally {
            // Корректно завершаем работу пула потоков

        }
    }
}