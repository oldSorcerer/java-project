package ru.javarush.java.core.level14.task11;

// Класс-шаблон для автомобиля: хранит марку и год выпуска


public class Solution {
    public static void main(String[] args) {
        // Создаем два независимых объекта класса Car с помощью new
        Car car1 = new Car();
        Car car2 = new Car();

        // Инициализируем поля первого автомобиля
        car1.carBrand = "Toyota";
        car1.carYear = 2020;

        // Инициализируем поля второго автомобиля
        car2.carBrand = "Lada";
        car2.carYear = 2010;

        // Выводим информацию о каждом автомобиле в требуемом формате
        System.out.printf("Марка: %s, год выпуска: %d%n", car1.carBrand, car1.carYear);
        System.out.printf("Марка: %s, год выпуска: %d%n", car2.carBrand, car2.carYear);
    }
}