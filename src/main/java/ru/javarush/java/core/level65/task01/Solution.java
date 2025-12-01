package ru.javarush.java.core.level65.task01;

// Публичный класс с main — просто для наглядной демонстрации корректных наследников (Car и Bike).
public class Solution {
    public static void main(String[] args) {
        // Корректные наследники: Car и Bike разрешены в permits и объявлены final
        Car car = new Car("Sedan");
        Bike bike = new Bike("Sport");

        System.out.println(car.info());
        System.out.println(bike.info());

        // Класс Bus ниже нарушает ограничения sealed-класса, поэтому проект не компилируется.
        Bus bus = new Bus("City");
    }
}