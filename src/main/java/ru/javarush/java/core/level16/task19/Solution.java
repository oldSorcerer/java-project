package ru.javarush.java.core.level16.task19;

// Универсальная пара данных: класс для хранения двух связанных элементов одного типа
class DataPair<T> {
    // Два приватных поля обобщённого типа T
    private T firstElement;
    private T secondElement;

    // Конструктор принимает два значения и инициализирует поля

    public DataPair(T firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    // Возвращаем первый элемент пары
    public T getFirst() {
        return firstElement;
    }

    // Возвращаем второй элемент пары
    public T getSecond() {
        return secondElement;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Создаем объект DataPair для строк и передаем "Hello" и "World"
        DataPair<String> pair = new DataPair<>("Hello", "World");

        // Выводим оба значения через пробел
        System.out.println(pair.getFirst() + " " + pair.getSecond());
    }
}