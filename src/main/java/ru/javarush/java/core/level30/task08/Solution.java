package ru.javarush.java.core.level30.task08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Исходные показания с датчиков
        List<Integer> readings = Arrays.asList(10, 15, 20, 25, 30);

        // Строим конвейер обработки:
        // 1) фильтруем только кратные 10
        // 2) с помощью peek выводим значения, прошедшие фильтр (до преобразования в строку)
        // 3) преобразуем числа в строки
        // 4) собираем в отдельный список


        // Выводим итоговый список строк на экран
        System.out.println(report);
    }
}