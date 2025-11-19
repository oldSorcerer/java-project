package ru.javarush.java.core.level26.task06;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        // TreeMap автоматически поддерживает сортировку ключей по алфавиту (естественный порядок String)
        Map<String, Integer> map = new TreeMap<>();

        // Добавляем данные о фруктах
        map.put("pear", 6);
        map.put("apple", 2);
        map.put("banana", 4);

        // Проходим по записям: порядок уже алфавитный благодаря TreeMap
        map.entrySet().stream()
                .map(entry -> "Фрукт: %s, Количество: %d".formatted(entry.getKey(), entry.getValue()))
                .forEach(System.out::println);
    }
}