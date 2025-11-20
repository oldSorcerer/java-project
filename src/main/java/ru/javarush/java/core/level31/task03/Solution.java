package ru.javarush.java.core.level31.task03;

import java.util.List;
import java.util.Optional;

public class Solution {
    public static void main(String[] args) {
        // Исходный список температур за неделю
        List<Integer> temperatures = List.of(7, 3, 15, 2, 9);

        // Ищем максимум через Stream API и reduce.
        // Используем вариант без identity, чтобы при пустом списке получить Optional.empty,
        // а не бросать исключение.


        // Выводим результат только если данные есть

    }
}