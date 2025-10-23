package ru.javarush.java.core.level22.task06;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект record-класса с именем и возрастом
        HistoricalFigure figure = new HistoricalFigure("Леонардо да Винчи", 67);

        System.out.println("Исходные данные: " + figure);
        System.out.println("Имя: " + figure.name() + ", возраст: " + figure.age());

        // Попытка 1: прямое присваивание полю (как в обычном классе)
        figure.name = "Микеланджело"; // Ошибка: поля record приватные и final, прямой доступ невозможен.

        // Попытка 2: вызов сеттера (как в обычном классе)
        figure.setName("Микеланджело"); // Ошибка: у record нет сеттеров, такого метода не существует.

        // Объект остается неизменным
        System.out.println("После «попыток изменения» объект не изменился: " + figure);
    }
}