package ru.javarush.java.core.level28.task07;

import java.util.EnumSet;

public class Solution {
    public static void main(String[] args) {
        // Создаем EnumSet — специальную коллекцию для enum-ов
        // Сразу инициализируем только выходными днями: суббота и воскресенье


        // Выводим содержимое EnumSet на экран
        System.out.println(weekendDays);
    }
}

// Перечисление с полным набором дней недели
enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}