package ru.javarush.java.core.level18.task01;

// Простая демонстрация полиморфизма: базовый класс Animal и потомок Dog.
public class Solution {
    public static void main(String[] args) {
        // Переменная базового типа Animal хранит объект Dog — это и есть полиморфизм
        Animal pet = new Dog();

        // Вызов переопределенного метода: напечатает "Гав!"
        pet.makeSound();
    }
}