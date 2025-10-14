package ru.javarush.java.core.level15.task12;

public class Solution {
    public static void main(String[] args) {
        // Создаем студента с начальным возрастом 10
        SchoolStudent student = new SchoolStudent(10);

        // Пытаемся установить отрицательный возраст
        student.setCurrentAge(-5);

        // Проверяем, что возраст не изменился — выводим через геттер
        System.out.println(student.getCurrentAge());

        // Устанавливаем корректный возраст
        student.setCurrentAge(15);

        // Проверяем, что возраст обновился
        System.out.println(student.getCurrentAge());
    }
}