package ru.javarush.java.core.level46.task05;

import com.google.gson.Gson;

public class Solution {
    public static void main(String[] args) {
        // Создаем и заполняем объект студента
        SchoolStudent student = new SchoolStudent();
        student.studentName = "Мария Иванова";
        student.studentGrade = 92;

        // Сериализуем объект в JSON с помощью Gson


        // Выводим результат на экран
        // В JSON имя поля должно быть "student_name"
        System.out.println(json);
    }
}