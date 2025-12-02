package ru.javarush.java.core.level65.task05;

public class Solution {
    public static void main(String[] args) {
        // Спрячем целое число в переменной типа Object
        Object mysteryValue = -5; // можно менять на 0, 7, "Java" для проверки разных веток

        // Используем switch-выражение с pattern matching и guard-условием (when)

            // Если это Integer и он положительный — сработает эта ветка


            // Если это Integer, но не положительный (ноль или отрицательное)


            // Во всех остальных случаях — не число (не Integer)



        System.out.println(message);
    }
}