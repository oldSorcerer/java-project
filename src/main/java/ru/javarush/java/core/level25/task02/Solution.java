package ru.javarush.java.core.level25.task02;

public class Solution {
    public static void main(String[] args) {
        // Создаем кота и передаем имя в конструктор Cat
        Cat cat = new Cat("Мурзик");

        // Проверим, что имя успешно инициализировалось через super(...)
        System.out.println(cat.name);
    }
}