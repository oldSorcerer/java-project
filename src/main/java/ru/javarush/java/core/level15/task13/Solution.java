package ru.javarush.java.core.level15.task13;

public class Solution {
    public static void main(String[] args) {
        // Получаем значение статического поля через имя класса (объект не создаем)
        // Поле приватное, поэтому обращаемся к нему через публичный статический геттер
        System.out.println(ApplicationMetrics.getActiveUserCount());
    }
}