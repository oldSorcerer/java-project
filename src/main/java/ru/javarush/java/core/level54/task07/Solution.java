package ru.javarush.java.core.level54.task07;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Solution {
    public static void main(String[] args) {
        // "Фонд Распределения Задач" — общий пул ForkJoin
        ForkJoinPool pool = new ForkJoinPool();

        // Главная задача: посчитать сумму чисел от 1 до 20
        SimpleSumTask task = new SimpleSumTask(1, 20);

        // Запускаем задачу в пуле и получаем итог
        int result = pool.invoke(task);

        // Демонстрация итогового результата
        System.out.println("Сумма от 1 до 20: " + result);
    }
}