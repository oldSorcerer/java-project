package ru.javarush.java.core.level21.task13;

public class Solution {
    public static void main(String[] args) {
        // Вызываем static-метод напрямую через имя интерфейса — без создания объектов
        System.out.println(StringChecker.isEmpty(""));     // true
        System.out.println(StringChecker.isEmpty("Java")); // false
    }
}