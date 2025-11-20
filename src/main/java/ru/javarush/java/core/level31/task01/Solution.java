package ru.javarush.java.core.level31.task01;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Список цен проданных товаров за день
        List<Integer> prices = Arrays.asList(100, 250, 80, 40);

        // Считаем среднюю цену через примитивный стрим; если список пуст — 0.0


        // Находим минимальную цену; если список пуст — -1


        // Выводим результаты на экран (каждое значение с новой строки)
        System.out.println(average);
        System.out.println(min);
    }
}