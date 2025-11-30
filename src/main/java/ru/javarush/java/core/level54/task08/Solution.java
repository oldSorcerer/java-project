package ru.javarush.java.core.level54.task08;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    // Размер массива и границы случайных значений
    private static final int SIZE = 1000;
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE_INCLUSIVE = 100;

    public static void main(String[] args) {
        // Создаем массив из 1000 целых чисел
        int[] codes = new int[SIZE];

        // Заполняем массив случайными числами в диапазоне [0; 100]
        for (int i = 0; i < codes.length; i++) {
            // nextInt(от, до) генерирует значения в полуинтервале [от; до),
            // поэтому верхняя граница — 101, чтобы включить 100.
            codes[i] = ThreadLocalRandom.current().nextInt(MIN_VALUE, MAX_VALUE_INCLUSIVE + 1);
        }

        // "Центр Обработки Задач" — явный ForkJoinPool
        ForkJoinPool pool = new ForkJoinPool();

        // Корневая задача: обработать весь массив
        CountEvensTask rootTask = new CountEvensTask(codes, 0, codes.length);

        // Запускаем задачу и получаем результат
        int evenCount = pool.invoke(rootTask);

        // Выводим итог: сколько четных чисел найдено
        System.out.println("Общее количество чётных чисел: " + evenCount);
    }
}