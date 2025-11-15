package ru.javarush.java.core.level18.task11;

public class Solution {
    public static void main(String[] args) {
        // Демонстрация полиморфизма: переменная типа Shape указывает на объект Circle
        Shape shape = new Circle();

        // Вызов переопределённого метода: должно вывести "Рисуем круг"
        shape.draw();
    }
}