package ru.javarush.java.core.level32.task02;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Исходные данные: ID студента -> список его хобби (неизменяемые коллекции)
        Map<Integer, List<String>> studentHobbyMap = Map.of(
                1, List.of("Плавание", "Шахматы"),
                2, List.of("Футбол"),
                3, List.of("Программирование", "Чтение", "Кино")
        );

        // Превращаем карту в поток её записей и "разворачиваем" каждую запись
        // в несколько строк формата "ID: Хобби" через mapMulti


        // Вывод результата
        System.out.println(individualHobbyEntries);
    }
}