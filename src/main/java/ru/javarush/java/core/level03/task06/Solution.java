package ru.javarush.java.core.level03.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с клавиатуры
        Scanner console = new Scanner(System.in);

        // Запрашиваем у пользователя возраст
        System.out.println("Введите ваш возраст:");
        int age = console.nextInt(); // Считываем возраст как целое число
        console.nextLine(); // Поглощаем оставшийся символ новой строки

        // Запрашиваем у пользователя город
        System.out.println("Введите ваш город:");
        String city = console.nextLine(); // Считываем город как строку

        // Проверяем возраст
        if (age >= 21) {
            // Если возраст >= 21, проверяем город
            if (city.equals("Минск")) {
                // Если город "Минск", выводим сообщение о доступе
                System.out.println("Добро пожаловать в клуб, Минск!");
            } else {
                // Если город не "Минск", выводим сообщение об отказе
                System.out.println("Извините, вход запрещен.");
            }
        } else {
            // Если возраст < 21, выводим сообщение об отказе
            System.out.println("Извините, вход запрещен.");
        }
    }
}