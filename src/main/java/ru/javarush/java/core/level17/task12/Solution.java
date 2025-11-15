package ru.javarush.java.core.level17.task12;

public class Solution {
    public static void main(String[] args) {
        // Создаем студента: при создании сначала сработает конструктор Person, затем Student
        Student anna = new Student("Анна", 3);
    }
}