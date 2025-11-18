package ru.javarush.java.core.level22.task11;

public class Solution {
    public static void main(String[] args) {
        // Создаем пользователя с произвольными данными
        UserProfile user = new UserProfile("Алиса", 25);

        // Печатаем объект — будет вызван наш переопределенный toString()
        System.out.println(user);
    }
}