package ru.javarush.java.core.level20.task10;

import java.io.Serializable;

public class Solution {
    public static void main(String[] args) {
        // Создаем пользователя с произвольным именем
        User user = new User("Алиса");

        // Получаем имя через метод getName() и выводим на экран
        System.out.println(user.getName());
    }
}