package ru.javarush.java.core.level25.task05;

public class Solution {
    public static void main(String[] args) {
        Shape shape; // Переменная базового типа (полиморфизм)

        // Один и тот же тип ссылки указывает на разные объекты и вызывает "свою" реализацию
        shape = new Square(5); // квадрат со стороной 5
        System.out.println("Площадь квадрата: " + shape.calculateSurface());

        shape = new Circle(3); // круг с радиусом 3
        System.out.println("Площадь круга: " + shape.calculateSurface());
    }
}