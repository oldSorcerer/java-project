package ru.javarush.java.core.level17.task10;

public class Car extends Vehicle{
    public Car(String brandName, int manufacturingYear) {
        super(brandName);
        System.out.printf("Машина %s, год: %d%n", brandName, manufacturingYear);
    }
}
