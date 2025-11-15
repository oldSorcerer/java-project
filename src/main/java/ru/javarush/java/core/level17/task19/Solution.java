package ru.javarush.java.core.level17.task19;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Student.
        // Порядок вывода:
        // 1) Сначала сработает конструктор Person (через super), затем
        // 2) Конструктор Student.
        Student elena = new Student("Елена");
    }
}