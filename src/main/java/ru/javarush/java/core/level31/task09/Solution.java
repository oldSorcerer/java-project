package ru.javarush.java.core.level31.task09;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Создаем и заполняем список абитуриентов (имя + GPA)
        List<Student> candidates = List.of(
                new Student("Алиса", 3.7),
                new Student("Борис", 2.8),
                new Student("Чен", 3.0),
                new Student("Дина", 2.4),
                new Student("Егор", 4.0)
        );

        // Разделяем на две группы по критерию GPA >= 3.0:
        // - partitioningBy выполняет разбиение на true/false
        // - mapping вытаскивает из Student только имена (String), собирая их в списки


        // Выводим полученную карту: {true=[имена с GPA >= 3.0], false=[остальные]}
        System.out.println(result);
    }
}

// Простой класс Student с приватными полями и геттерами
class Student {
    private final String name;
    private final double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getStudentName() {
        return name;
    }

    public double getStudentGpa() {
        return gpa;
    }
}