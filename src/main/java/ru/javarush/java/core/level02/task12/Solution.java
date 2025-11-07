package ru.javarush.java.core.level02.task12;

public class Solution {
    public static void main(String[] args) {
        // Очки приходят как текстовые строки с отрицательными числами
        String str1 = "-10";
        String str2 = "-25";

        // Преобразуем строки в числа типа int
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        // Складываем результаты двух раундов
        int result = num1 + num2;

        // Выводим общий счёт на экран
        System.out.println(result);
    }
}