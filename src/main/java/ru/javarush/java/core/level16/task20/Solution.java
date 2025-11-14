package ru.javarush.java.core.level16.task20;

public class Solution {

    // Публичный статический (вложенный) класс с утилитарным методом
    public static class DevUtils {
        // Универсальный метод с дженериком: принимает параметр любого типа T
        public static <T> void printTwice(T value) {
            System.out.println(value);
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        // Демонстрация универсальности: строка и число
        DevUtils.printTwice("Java");
        DevUtils.printTwice(100);
    }
}