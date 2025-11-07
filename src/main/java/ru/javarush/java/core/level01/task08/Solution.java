package ru.javarush.java.core.level01.task08;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа String для имени пользователя
        String userName = "Alice";

        // Объявляем переменную типа int для возраста пользователя
        int userAge = 20;

        // Создаем строку, объединяющую имя и возраст пользователя
        String profileInfo = String.format("Имя: %s, Возраст: %d", userName, userAge);

        // Выводим информацию о профиле на экран
        System.out.println(profileInfo);
    }
}