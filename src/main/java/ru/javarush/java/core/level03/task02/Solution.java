package ru.javarush.java.core.level03.task02;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную currentTemperature и присваиваем ей значение -5
        int currentTemperature = -5;

        // Проверяем, меньше ли температура 0
        if (currentTemperature < 0) {
            // Если температура меньше 0, выводим сообщение о морозе
            System.out.println("Оденьтесь потеплее, на улице мороз!");
        } else {
            // Если температура не меньше 0, выводим сообщение о легкой одежде
            System.out.println("Можно идти в легкой одежде!");
        }
    }
}