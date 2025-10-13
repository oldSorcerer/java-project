package ru.javarush.java.core.level14.task16;

public class Solution {
    public static void main(String[] args) {
        // Создаём четырёх студентов, используя каждый из четырёх конструкторов
        Student full = new Student("Алиса", "Физика", 95);
        Student noScore = new Student("Борис", "Математика");
        Student nameOnly = new Student("Светлана");
        Student empty = new Student();

        // Выводим значения всех полей каждого студента
        printStudent(full);
        printStudent(noScore);
        printStudent(nameOnly);
        printStudent(empty);
    }

    // Небольшой помощник для наглядного вывода всех полей студента
    private static void printStudent(Student s) {
        System.out.println("Имя: " + s.studentName
                + ", Группа: " + s.studentGroup
                + ", Балл: " + s.studentScore);
    }
}