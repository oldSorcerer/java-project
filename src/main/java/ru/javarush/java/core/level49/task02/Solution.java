package ru.javarush.java.core.level49.task02;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) {
        // Исходные числовые показатели
        List<Integer> metrics = List.of(3, 8, 15, 22, 7);

        // Predicate: отбираем только значимые показатели (> 10)


        // Function: превращаем число в строку "Число: X"


        // Consumer: выводим строку на экран (немедленно для каждого элемента)


        // Проходим по списку: фильтрация -> преобразование -> вывод


        // Supplier: генерация бонусного числа в диапазоне [1; 100]


        // Выводим результат бонуса (используем тот же Consumer для единообразия)

    }
}