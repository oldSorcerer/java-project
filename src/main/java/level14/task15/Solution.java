package ru.javarush.java.core.level14.task15;

// Класс Car — простой "чертёж" автомобиля с тремя полями и перегруженными конструкторами

public class Solution {
    public static void main(String[] args) {
        // 1) Сборка автомобиля с указанием всех параметров
        Car fullConfigured = new Car("Toyota", "Camry", 2022);
        printCar(fullConfigured);

        // 2) Сборка автомобиля с маркой и моделью, год автоматически станет 2024
        Car brandModelOnly = new Car("Tesla", "Model 3");
        printCar(brandModelOnly);

        // 3) Сборка автомобиля без параметров: "Unknown", "Unknown", 2024
        Car defaults = new Car();
        printCar(defaults);
    }

    // Удобный метод для вывода значений всех полей автомобиля
    private static void printCar(Car car) {
        System.out.println(car.carBrand + " " + car.carModel + " " + car.productionYear);
    }
}