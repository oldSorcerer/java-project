package ru.javarush.java.core.level33.task10;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Создаем экземпляр нашего кастомного Collector
        Collector<String, Map<Integer, List<String>>, Map<Integer, List<String>>> byLength =
                new GroupByLengthCollector();

        // Применяем коллектор к потоку строк
        Map<Integer, List<String>> result = Stream.of("cat", "dog", "lion", "bat", "tiger")
                .collect(byLength);

        // Выводим результат на экран
        System.out.println(result); // Ожидаемо: {3=[cat, dog, bat], 4=[lion], 5=[tiger]}
    }
}