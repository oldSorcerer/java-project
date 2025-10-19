package ru.javarush.java.core.level02.task08;

public class Solution {
    public static void main(String[] args) {
        // Объявляем строковую переменную с лишними пробелами в начале и конце
        String cityName = "  Minsk  ";

        // Выводим длину строки до удаления пробелов
        System.out.println(cityName.length());

        // Удаляем пробелы по краям и сохраняем результат обратно в переменную
        cityName = cityName.trim();

        // Выводим длину строки после удаления пробелов
        System.out.println(cityName.length());

        // Выводим название города в верхнем и нижнем регистре
        System.out.println(cityName.toUpperCase());
        System.out.println(cityName.toLowerCase());

    }
}