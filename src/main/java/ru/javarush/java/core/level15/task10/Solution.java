package ru.javarush.java.core.level15.task10;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект профиля студента с начальным возрастом (например, 18)
        StudentProfile profile = new StudentProfile(18);

        // Обновляем возраст до 20 с помощью сеттера
        profile.setStudentAge(20);

        // Выводим текущий возраст, чтобы убедиться, что он обновился
        System.out.println(profile.getStudentAge());
    }
}