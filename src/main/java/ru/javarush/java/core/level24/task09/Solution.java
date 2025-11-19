package ru.javarush.java.core.level24.task09;

public class Solution {
    public static void main(String[] args) {
        // Создаем "первопричину" — уже существующее исключение
        Throwable rootCause = new NullPointerException("данные отсутствуют!");

        // Создаем наше исключение и "прикрепляем" к нему первопричину


        // Выводим на экран первопричину через getCause()
        // Ожидаем увидеть NullPointerException с тем же сообщением
        System.out.println(failure.getCause());
    }
}