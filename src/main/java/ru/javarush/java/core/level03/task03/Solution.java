package ru.javarush.java.core.level03.task03;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную userPassword и присваиваем ей значение "qwerty"
        String userPassword = "qwerty";

        // Проверяем, совпадает ли пароль с ожидаемым значением "qwerty"
        if (userPassword.equals("qwerty")) {
            // Если условие истинно, выводим сообщение об успешном входе
            System.out.println("Вход выполнен успешно");
        }
        // Если пароль не совпадает, блок else не используется и программа ничего не выводит
    }
}