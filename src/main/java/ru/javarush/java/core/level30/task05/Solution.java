package ru.javarush.java.core.level30.task05;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Исходный список гостей в порядке очереди
        List<String> waiting = List.of("первый", "второй", "третий", "четвёртый", "пятый");

        // Пропускаем первых двух (VIP) с помощью Stream API и метода skip,
        // формируем новый список из оставшихся гостей


        // Выводим окончательный список гостей, которым нужно выдать пропуска
        regularGuests.forEach(System.out::println);
    }
}