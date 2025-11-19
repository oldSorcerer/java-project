package ru.javarush.java.core.level26.task08;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Исходный список с повторами
        List<String> list = Arrays.asList("яблоко", "груша", "яблоко", "слива", "груша");

        // Используем Set для удаления дубликатов.
        Set<String> set = new LinkedHashSet<>(list);

        // Выводим итоговый набор уникальных товаров
        set.forEach(System.out::println);
    }
}