package ru.javarush.java.core.level18.task09;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект собаки — нашего обитателя зоопарка
        Dog dog = new Dog();

        // Просим собаку издать звук.
        // Должен быть выведен переопределенный вариант: "Гав!"
        dog.makeSound();
    }
}