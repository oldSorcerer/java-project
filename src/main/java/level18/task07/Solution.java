package ru.javarush.java.core.level18.task07;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект робота-приветствия
        Greetings robot = new Greetings();

        // Приветствие по имени
        robot.sayHello("Алекс");

        // Полное приветствие по имени и фамилии
        robot.sayHello("Джон", "Доу");
    }
}