package ru.javarush.java.core.level15.task10;

public class StudentProfile {
    private int studentAge;

    public StudentProfile(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int newAge) {
        this.studentAge = newAge;
    }
}
