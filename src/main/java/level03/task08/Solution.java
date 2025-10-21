package ru.javarush.java.core.level03.task08;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner console = new Scanner(System.in);

        // Запрашиваем возраст пользователя
        System.out.println("Введите ваш возраст:");
        int age = console.nextInt();
        console.nextLine(); // Считываем оставшийся символ новой строки

        // Запрашиваем наличие клубной карты
        System.out.println("У вас есть клубная карта? (да/нет):");
        String hasClubCard = console.nextLine().trim().toLowerCase();

        // Проверяем условия для определения скидки
//        if (/* условие */) {
//            // Если возраст 65 или больше, предоставляем скидку 20%
//
//        } else {
//            // Если возраст меньше 65, проверяем наличие клубной карты
//            if (/* условие */) {
//                // Если есть клубная карта, предоставляем скидку 10%
//
//            } else {
//                // Во всех остальных случаях скидки нет
//
//            }
//        }
    }
}