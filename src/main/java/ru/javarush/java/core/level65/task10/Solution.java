package ru.javarush.java.core.level65.task10;

// Объявляем record-класс Point с двумя целочисленными компонентами x и y
record Point(int x, int y) {}

public class Solution {
    public static void main(String[] args) {
        // Создаем переменную типа Object и "кладем" в нее экземпляр Point
        Object geometricObject = new Point(10, 20);

        // Специально ошибочная попытка pattern matching с некорректными типами:


        // Исправленный вариант: используем правильные типы компонентов — int

    }
}