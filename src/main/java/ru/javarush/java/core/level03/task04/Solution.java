package ru.javarush.java.core.level03.task04;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную currentHour и присваиваем ей значение 20
        int currentHour = 20;

        // Используем оператор if-else if-else для выбора нужного приветствия
        if (currentHour < 12) {
            // Если текущее время меньше 12, считаем, что это утро
            System.out.println("Доброе утро!");
        } else if (currentHour >= 12 && currentHour <= 18) {
            // Если текущее время от 12 до 18 включительно, считаем, что это день
            System.out.println("Добрый день!");
        } else {
            // Во всех остальных случаях считаем, что это вечер
            System.out.println("Добрый вечер!");
        }
    }
}