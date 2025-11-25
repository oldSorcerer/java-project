package ru.javarush.java.core.level48.task09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        // Исходный список животных
        List<String> animals = new ArrayList<>(Arrays.asList("dog", "cow", "horse", "sheep"));

        // Удаляем из списка все строки короче 4 символов,
        // передавая в removeIf анонимный класс, реализующий Predicate<String>.


        // Вывод очищенного списка
        System.out.println(animals); // Ожидается: [horse, sheep]
    }
}