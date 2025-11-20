package ru.javarush.java.core.level33.task04;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Список номеров сокровищ
        List<Integer> treasures = List.of(10, 15, 20, 25, 30);

        // Ленивая обработка:
        // peek печатает только для реально обработанных элементов,
        // findFirst останавливает обработку, как только найден первый подходящий элемент


        // Выводим номер найденного артефакта
        System.out.println(artifact);
    }
}