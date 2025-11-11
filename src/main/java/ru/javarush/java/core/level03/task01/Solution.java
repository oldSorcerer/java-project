package ru.javarush.java.core.level03.task01;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную visitorAge и сразу инициализируем её значением 17
        int visitorAge = 17;

        // Используем оператор if-else для проверки: если возраст меньше 18
        if (visitorAge < 18) {
            // При несовершеннолетии выводим сообщение о запрете доступа
            System.out.println("Доступ запрещен");
        } else {
            // Иначе — приветствуем посетителя
            System.out.println("Добро пожаловать!");
        }
    }
}