package ru.javarush.java.core.level30.task06;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Исходные данные с повторами
        List<Integer> sales = List.of(5, 7, 5, 9, 7, 11, 13, 9, 15);

        // Stream-пайплайн:
        // distinct() — удаляем дубликаты, сохраняя порядок первого появления
        // limit(4) — оставляем только первые четыре уникальных значения


        // Выводим получившийся список
        System.out.println(top4Unique); // [5, 7, 9, 11]
    }
}