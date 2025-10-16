package ru.javarush.java.core.level18.task06;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект "умного" калькулятора
        Multiplier multiplier = new Multiplier();

        // Сначала умножаем два целых числа
        int intResult = multiplier.multiply(5, 4);

        // Затем умножаем два числа с плавающей точкой
        double doubleResult = multiplier.multiply(2.5, 3.0);

        // Выводим результаты на экран
        System.out.println(intResult);
        System.out.println(doubleResult);
    }
}