package ru.javarush.java.core.level19.task13;

public class Solution {
    public static void main(String[] args) {
        // Создаём круг радиуса 2.0
        Circle circle = new Circle(2.0);

        // Выводим площадь. Ожидаем увидеть 12.56
        System.out.println(circle.area());
    }
}