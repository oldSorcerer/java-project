package ru.javarush.java.core.level30.task02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Исходный список категорий в нижнем регистре
        List<String> categories = Arrays.asList("java", "stream", "api");

        // Преобразуем каждый элемент в верхний регистр с помощью Stream API
        // и собираем результат в НОВЫЙ список (исходный список остаётся без изменений).


        // Выводим новый список на экран
        System.out.println(uppercased);
    }
}