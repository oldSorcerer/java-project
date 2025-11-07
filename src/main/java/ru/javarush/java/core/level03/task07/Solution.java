package ru.javarush.java.core.level03.task07;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Запрашиваем и считываем возраст пользователя
        System.out.println("Введите ваш возраст:");
        int age = Integer.parseInt(console.nextLine());

        // Запрашиваем и считываем код приглашения
        System.out.println("Введите код приглашения:");
        String code = console.nextLine().trim();

        // Вложенная логика: сначала проверяем возраст, затем код
//        if (/* условие */) {
//            // Возраст подходит — проверяем тип приглашения
//            if (/* условие */) {
//
//            } else if (/* условие */) {
//
//            } else {
//
//            }
//        } else {
//            // Возраст меньше 21 — доступ запрещен
//
//        }
    }
}