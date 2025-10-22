package ru.javarush.java.core.level14.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаем два объекта Student и сразу инициализируем их поля через конструктор
        Student anna = new Student();
        anna.studentName = "Анна";
        anna.enrollmentYear = 2022;
        Student ivan = new Student();
        ivan.studentName = "Иван";
        ivan.enrollmentYear = 2023;

        // Выводим информацию о каждом студенте в заданном формате
        System.out.printf("Имя: %s, год поступления: %s%n", anna.studentName, anna.enrollmentYear);
        System.out.printf("Имя: %s, год поступления: %s%n", ivan.studentName, ivan.enrollmentYear);
    }
}

// Класс-форма для студента: хранит имя и год поступления
class Student {
    String studentName;
    int enrollmentYear;
}