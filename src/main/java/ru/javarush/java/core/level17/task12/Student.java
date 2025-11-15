package ru.javarush.java.core.level17.task12;

public class Student extends Person {

    public Student(String humanName, int studentGrade) {
        super(humanName);
        System.out.printf( "Создан студент: %s, класс: %d%n", humanName, studentGrade);
    }
}
