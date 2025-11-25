package ru.javarush.java.core.level46.task05;

import com.google.gson.annotations.SerializedName;

public class SchoolStudent {
    // Аннотация указывает, что в JSON это поле должно называться "student_name"

    String studentName;

    // Средний балл студента
    int studentGrade;
}