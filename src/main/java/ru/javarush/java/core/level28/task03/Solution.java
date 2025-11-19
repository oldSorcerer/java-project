package ru.javarush.java.core.level28.task03;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем список студентов и наполняем его объектами Student с именами
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван"));
        students.add(new Student("Мария"));
        students.add(new Student("Петр"));

        // Создаем новый список для хранения только имён студентов
        List<String> names = new ArrayList<>();
        // Преобразуем каждый объект Student в строку с именем и добавляем в список names

        

        // Выводим на экран список имён в формате [Иван, Мария, Петр]
        System.out.println(names);
    }
}

// Класс Student с единственным полем studentName и конструктором для инициализации
class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    // Геттер для получения имени студента
    public String getStudentName() {
        return studentName;
    }
}