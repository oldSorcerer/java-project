package ru.javarush.java.core.level17.task09;

// В этой задаче демонстрируем переопределение метода и вызов базовой реализации через super.
public class Solution {
    public static void main(String[] args) {
        // Создаем объект собаки и вызываем её метод makeSound()
        Dog dog = new Dog();
        dog.makeSound();
    }
}