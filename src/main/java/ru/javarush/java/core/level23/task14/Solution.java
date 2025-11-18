package ru.javarush.java.core.level23.task14;

public class Solution {
    public static void main(String[] args) {
        // "Холст" для фигур: массив общего типа Shape (демонстрация полиморфизма)
        Shape[] canvas = new Shape[2];

        // Добавляем по одному объекту каждой конкретной фигуры
        canvas[0] = new Circle();
        canvas[1] = new Square();

        // Проходим по массиву и полиморфно вызываем метод printType()
        for (Shape shape : canvas) {
            shape.printType(); // каждая фигура печатает своё имя
        }
    }
}