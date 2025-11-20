package ru.javarush.java.core.level31.task04;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Исходный список "магических слов" в нужном порядке
        List<String> magicWords = List.of("Java", "Stream", "API");

        // Используем Stream API и метод collect с Collectors.joining(" "),
        // чтобы объединить слова одной строкой через пробел


        // Произносим заклинание вслух — выводим результат на экран
        System.out.println(spell);
    }
}