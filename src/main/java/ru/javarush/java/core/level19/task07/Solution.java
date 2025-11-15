package ru.javarush.java.core.level19.task07;

// Главный класс с точкой входа
public class Solution {
    public static void main(String[] args) {
        // Создаем круг с именем "Круг" и радиусом 2.0
        Circle circle = new Circle("Круг", 2.0);

        // Сначала выводим имя фигуры
        System.out.println(circle.name);

        // Затем выводим площадь круга
        System.out.println(circle.area());
    }
}