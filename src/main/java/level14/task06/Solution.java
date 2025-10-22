package ru.javarush.java.core.level14.task06;

public class Solution {
    public static void main(String[] args) {
        // "Зачисляем" нового студента, сразу задавая имя и оценку в конструкторе
        Student student = new Student("Ivan", 5);

        // Торжественно объявляем о его появлении
        System.out.printf("Имя: %s, оценка: %d%n", student.studentName, student.studentGrade);
    }
}

// Отдельный класс Student с полями и конструктором
class Student {
    String studentName;
    int studentGrade;

    public Student(String studentName, int studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }
}