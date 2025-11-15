package ru.javarush.java.core.level19.task02;

public class Solution {
    public static void main(String[] args) {
        // Демонстрация работы: полиморфный вызов makeSound()
        Animal dog = new Dog();
        dog.makeSound(); // Ожидаемый вывод: Гав!
    }
}