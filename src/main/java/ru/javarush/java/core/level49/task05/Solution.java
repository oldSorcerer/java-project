package ru.javarush.java.core.level49.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Список кличек участников парада
        List<String> animals = new ArrayList<>(Arrays.asList("кот", "слон", "тигр", "мышь"));

        // Функция сравнения (Comparator): сравниваем строки по длине


        // Передаем функцию сравнения в метод сортировки — сортировка по возрастанию длины


        // Выводим каждую кличку на новой строке
        for (String name : animals) {
            System.out.println(name);
        }
    }
}