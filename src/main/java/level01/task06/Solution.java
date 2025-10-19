package ru.javarush.java.core.level01.task06;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную currentYear и присваиваем ей значение 2025
        int currentYear = 2025;

        // Объявляем переменную projectAge
        int projectAge;

        // Вычисляем возраст проекта как разницу между currentYear и 2019
        projectAge = currentYear - 2019;

        // Выводим возраст проекта на экран
        System.out.println(projectAge);
    }
}