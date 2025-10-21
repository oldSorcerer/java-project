package ru.javarush.java.core.level03.task05;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner console = new Scanner(System.in);

        // Запрашиваем у пользователя ввод возраста
        System.out.println("Введите ваш возраст:");
        int age = console.nextInt(); // Читаем возраст как целое число
        console.nextLine(); // Поглощаем оставшийся символ новой строки

        // Запрашиваем у пользователя ввод секретного кода
        System.out.println("Введите секретный код:");
        String secretCode = console.nextLine(); // Читаем секретный код как строку

        // Проверяем возраст
//        if (/* условие */) {
//            // Если возраст >= 18, проверяем секретный код
//            if (/* условие */) {
//                // Если код равен "OPEN", разрешаем вход
//
//            } else {
//                // Если код не равен "OPEN", запрещаем вход
//
//            }
//        } else {
//            // Если возраст < 18, запрещаем вход
//
//        }
    }
}