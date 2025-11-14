package ru.javarush.java.core.level14.task19;

public class Solution {
    public static void main(String[] args) {
        // Запускаем "сборку" новой машины: при создании объекта сработает нестатический блок инициализации
        Car newCar = new Car();
    }
}

// "Чертёж" автомобиля
class Car {
    private String carModel = "Неизвестно";

    {
        System.out.println("Создаётся объект Car, model = " + carModel);
    }
}