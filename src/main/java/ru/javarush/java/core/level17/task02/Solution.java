package ru.javarush.java.core.level17.task02;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект собаки
        Dog dog = new Dog();

        // Присваиваем имя питомцу
        dog.petName = "Шарик";

        // Демонстрируем наследуемое поведение сна
        dog.sleep();

        // Демонстрируем уникальное поведение собаки — лай
        dog.bark();
    }
}