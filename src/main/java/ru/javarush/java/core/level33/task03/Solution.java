package ru.javarush.java.core.level33.task03;

import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Создаем список чисел от 1 до 5
        List<Integer> foods = List.of(1, 2, 3, 4, 5);

        // Строим ленивую Stream-цепочку: filter -> map.
        // Внутри лямбд есть println, но они НЕ выполнятся без терминальной операции.

    }
}