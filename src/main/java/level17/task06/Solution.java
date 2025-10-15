package ru.javarush.java.core.level17.task06;

// Симулятор зоопарка: демонстрация наследования и переопределения методов
public class Solution {
    public static void main(String[] args) {
        // Создаем собаку и просим подать голос
        Dog dog = new Dog();
        dog.makeSound(); // Должно вывести "Woof!"
    }
}