package ru.javarush.java.core.level17.task16;

public class Solution {
    public static void main(String[] args) {
        // Создаем кошку и задаем ей имя
        Cat cat = new Cat();
        cat.animalName = "Мурка";

        // Демонстрируем все способности: переопределенный eat, уникальный feedMilk и purr
        cat.eat();
        cat.feedMilk();
        cat.purr();
    }
}