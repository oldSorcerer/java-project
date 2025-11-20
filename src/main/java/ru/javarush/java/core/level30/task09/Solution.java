package ru.javarush.java.core.level30.task09;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Исходный список зарегистрированных участников с дубликатами
        List<String> registered = List.of("Анна", "Сергей", "Анна", "Мария", "Иван", "Сергей");

        // Используем Stream API для удаления дубликатов:
        // distinct() оставляет только уникальные элементы в порядке первого появления


        // Выводим окончательный список уникальных участников
        uniqueParticipants.forEach(System.out::println);
    }
}