package ru.javarush.java.core.level65.task07;

// Компактный record-класс для хранения координат точки
record Point(int x, int y) {}

public class Solution {
    public static void main(String[] args) {
        // Демонстрация работы метода describePoint
        describePoint(new Point(0, 5)); // Ось Y
        describePoint(new Point(7, 0)); // Ось X
        describePoint(new Point(4, 6)); // Обычная точка
        describePoint("abc");           // Не точка
    }

    // Метод принимает Object и использует современный switch с record patterns
    static void describePoint(Object inputObject) {
        // В case используем record pattern Point(int x, int y) и guard-выражение when


    }
}