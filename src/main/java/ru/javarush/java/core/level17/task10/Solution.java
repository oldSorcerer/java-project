package ru.javarush.java.core.level17.task10;

public class Solution {
    public static void main(String[] args) {
        // Создаём объект Car: сначала сработает конструктор Vehicle (через super),
        // затем — вывод из конструктора Car
        Car car = new Car("BMW", 2023);
    }
}