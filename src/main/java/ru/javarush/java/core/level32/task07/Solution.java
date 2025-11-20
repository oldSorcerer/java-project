package ru.javarush.java.core.level32.task07;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        // Исходные данные
        String[] availableColors = {"red", "green", "blue", "yellow"};
        int[] itemCodes = {1, 2, 3};

        // Берем минимальную длину: лишние элементы должны быть проигнорированы


        // "Зипуем" массивы по индексу с помощью IntStream.range
        // Для каждого i формируем строку "цвет-код" и собираем в список finalLabels


        // Выводим получившийся список на экран
        System.out.println(finalLabels);
    }
}