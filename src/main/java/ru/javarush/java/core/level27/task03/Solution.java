package ru.javarush.java.core.level27.task03;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаём словарь переводов: английское слово -> русский перевод
        Map<String, String> map = new HashMap<>();

        // Заполняем словарь тремя парами
        map.put("dog", "собака");
        map.put("cat", "кошка");
        map.put("bird", "птица");

        // Перебираем пары через for-each по entrySet()
        // (под капотом используется Iterator, что и требуется по условию)
        for (Map.Entry<String, String> entry : map.entrySet()) {
            // Форматированный вывод в виде "ключ = значение"
            System.out.printf("%s = %s%n", entry.getKey(), entry.getValue());
        }

//        map.entrySet().stream()
//                .map(e -> "%s = %s".formatted(e.getKey(), e.getValue()))
//                .forEach(System.out::println);
    }
}