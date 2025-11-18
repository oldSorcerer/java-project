package ru.javarush.java.core.level22.task18;

public class Solution {
    public static void main(String[] args) {
        // Создаем две точки с одинаковыми координатами
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);

        // Сравниваем точки с помощью equals, сгенерированного record-классом
        boolean same = p1.equals(p2);

        // Выводим результат сравнения
        System.out.println(same);
    }
}