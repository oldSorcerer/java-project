package ru.javarush.java.core.level17.task14;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект класса Car
        Car car = new Car();

        // Демонстрируем возможности: сначала движение, затем сигнал
        car.move();
        car.beep();
    }
}