package ru.javarush.java.core.level17.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаем объекты яблока и банана
        Apple apple = new Apple();
        Banana banana = new Banana();

        // Задаем цвета для каждого фрукта (поле унаследовано от Fruit)
        apple.fruitColor = "красный";
        banana.fruitColor = "жёлтый";

        // Выводим цвет каждого фрукта
        apple.printColor();
        banana.printColor();
    }
}