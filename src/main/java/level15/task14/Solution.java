package ru.javarush.java.core.level15.task14;

public class Solution {
    public static void main(String[] args) {
        // Создаем удостоверение с именем "Алиса"
        StudentIdentityCard card = new StudentIdentityCard("Алиса");

        // Выводим имя студента через геттер
        System.out.println(card.getStudentName());

        // Попытка изменить имя невозможна:
        card.studentName = "Боб"; // так нельзя — поле приватное и final (ошибка компиляции)
    }
}