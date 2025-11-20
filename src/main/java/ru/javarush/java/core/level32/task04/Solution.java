package ru.javarush.java.core.level32.task04;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Создаем неизменяемый список с названиями планет
        List<String> celestialBodies = List.of("Луна", "Марс", "Венера");

        // Получаем Stream из списка и объединяем элементы с разделителем " | "


        // Формируем итоговую строку с заголовком и выводим на экран
        System.out.println("Планеты: " + joined);
    }
}