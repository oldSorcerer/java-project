package ru.javarush.java.core.level18.task20;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив типа Animal и наполняем его разными животными
        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Мурка");
        animals[1] = new Cow("Буренка");

        // Полиморфный вызов: у каждого животного вызывается его реализация makeSound()
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}