package ru.javarush.java.core.level17.task03;

public class Solution {
    public static void main(String[] args) {
        // Создаем автомобиль, который наследует поведение от Vehicle
        Car car = new Car();

        // Указываем модель автомобиля
        car.vehicleModel = "Lada";

        // Запускаем автомобиль: должно вывести "Lada заводится."
        car.start();
    }
}