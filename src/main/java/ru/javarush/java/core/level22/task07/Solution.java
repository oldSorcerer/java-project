package ru.javarush.java.core.level22.task07;

public class Solution {
    public static void main(String[] args) {
        // Инициализируем начальную точку (3, 7)
        Point start = new Point(3, 7);

        // Создаём новую точку со смещением по горизонтали на 2, вертикаль оставляем прежней
        Point moved = new Point(start.horizontal() + 2, start.vertical());

        // Выводим обе точки: сначала начальную, затем новую
        System.out.println(start);
        System.out.println(moved);
    }
}