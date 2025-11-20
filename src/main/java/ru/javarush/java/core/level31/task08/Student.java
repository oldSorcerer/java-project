package ru.javarush.java.core.level31.task08;

// Класс-модель студента для отчёта
public class Student {
    private final String studentName;       // Имя студента
    private final int studyCourse;          // Курс обучения (например, 1..4)
    private final String studentSpecialty;  // Специальность (например, "Информатика")
    private final double averageGrade;      // Средний балл

    public Student(String studentName, int studyCourse, String studentSpecialty, double averageGrade) {
        this.studentName = studentName;
        this.studyCourse = studyCourse;
        this.studentSpecialty = studentSpecialty;
        this.averageGrade = averageGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudyCourse() {
        return studyCourse;
    }

    public String getStudentSpecialty() {
        return studentSpecialty;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}