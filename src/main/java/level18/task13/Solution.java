package ru.javarush.java.core.level18.task13;

public class Solution {
    public static void main(String[] args) {
        // Используем полиморфизм: ссылки типа Animal на объекты Dog и Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Сначала "голос" собаки, затем "голос" кошки
        dog.makeSound();
        cat.makeSound();
    }
}