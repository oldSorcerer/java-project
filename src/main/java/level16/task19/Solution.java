package ru.javarush.java.core.level16.task19;

// Универсальная пара данных: класс для хранения двух связанных элементов одного типа
class DataPair {
    // Два приватных поля обобщённого типа T


    // Конструктор принимает два значения и инициализирует поля


    // Возвращаем первый элемент пары


    // Возвращаем второй элемент пары

}

public class Solution {
    public static void main(String[] args) {
        // Создаем объект DataPair для строк и передаем "Hello" и "World"
        DataPair<String> pair = new DataPair<>("Hello", "World");

        // Выводим оба значения через пробел
        System.out.println(pair.getFirst() + " " + pair.getSecond());
    }
}