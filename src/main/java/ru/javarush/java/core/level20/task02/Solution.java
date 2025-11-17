package ru.javarush.java.core.level20.task02;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную универсального типа интерфейса Drawable — "инструмент для рисования"
        Drawable tool = new Circle(); // Присваиваем ей конкретную фигуру — круг

        // Вызываем метод draw() через переменную интерфейсного типа
        tool.draw(); // Ожидаемый вывод: "Drawing a circle"
    }
}