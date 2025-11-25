package ru.javarush.java.core.level48.task02;

import java.util.function.Function;

public class Solution {
    public static void main(String[] args) {
        // Создаем функцию-предсказательницу с помощью лямбда-выражения.
        

        // Тестируем функцию на числах 7 и 10 и выводим предсказания на экран
        System.out.println(predictor.apply(7));   // Ожидается: Нечётное
        System.out.println(predictor.apply(10));  // Ожидается: Чётное
    }
}