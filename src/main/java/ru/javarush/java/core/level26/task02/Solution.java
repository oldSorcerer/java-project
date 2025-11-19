package ru.javarush.java.core.level26.task02;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаем "картотеку" студентов: ключ — имя (String), значение — возраст (Integer)
        Map<String, Integer> map = new HashMap<>();

        // Добавляем три записи о студентах
        map.put("Иван", 20);
        map.put("Мария", 21);
        map.put("Алексей", 19);

        // Выводим полный список всех студентов и их возрастов
        map.entrySet().stream()
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .forEach(System.out::println);
    }
}