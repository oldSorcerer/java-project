package ru.javarush.java.core.level18.task08;

public class Solution {
    public static void main(String[] args) {
        // Создаем квадрат 5x5 (используем конструктор с одним параметром)
        Rectangle square = new Rectangle(5);

        // Создаем прямоугольник 10x7 (используем конструктор с двумя параметрами)
        Rectangle rectangle = new Rectangle(10, 7);

        // Выводим значения width и height для обоих объектов (через пробел)
        System.out.println(square.width + " " + square.height);
        System.out.println(rectangle.width + " " + rectangle.height);
    }
}