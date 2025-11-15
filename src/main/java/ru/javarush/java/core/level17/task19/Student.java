package ru.javarush.java.core.level17.task19;

public class Student extends Person {

    public Student(String studentName) {
        super(studentName);
        System.out.println( "Student создан: " + studentName);
    }
}
