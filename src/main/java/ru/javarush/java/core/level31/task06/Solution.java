package ru.javarush.java.core.level31.task06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Исходный список экзотических фруктов
        List<String> fruits = Arrays.asList(
                "Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry"
        );

        // Разделяем фрукты на две корзины с помощью Stream API и partitioningBy:
        // ключ true — название начинается с 'A', ключ false — все остальные


        // Выводим содержимое обеих корзин
        System.out.println("Корзина с фруктами на 'A': " + ...);
        System.out.println("Корзина с остальными фруктами: " + ...);
    }
}