package ru.javarush.java.core.level14.task05;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Car с произвольными значениями марки и года выпуска
        Car car =  new Car("BMW", 2025);

        // Просим автомобиль "представиться"
        car.displayDetails();
    }
}

// Класс Car хранит марку и год выпуска и умеет выводить информацию о себе
class Car {
    String carBrand;
    int productionYear;

    public Car(String carBrand, int productionYear) {
        this.carBrand = carBrand;
        this.productionYear = productionYear;
    }

    public void displayDetails() {
        System.out.printf("Марка: %s, год выпуска: %s%n", carBrand, productionYear);
    }
}