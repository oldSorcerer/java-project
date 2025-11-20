package ru.javarush.java.core.level30.task03;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Исходный список названий предметов
        List<String> items = List.of("apple", "banana", "apricot", "cherry", "avocado");

        // Обрабатываем список с помощью Stream API:
        // 1) filter — оставляем строки, которые начинаются на 'a'
        // 2) map — заменяем строку на её длину
        // 3) collect — собираем длины в новый список


        // Выводим получившийся список длин
        System.out.println(lengths);
    }
}