package ru.javarush.java.core.level17.task15;

public class Solution {
    public static void main(String[] args) {
        // Создаем самый специфичный тип в иерархии — школьника
        SchoolStudent schoolStudent = new SchoolStudent();

        // Вызываем переопределенный метод introduce()
        // Ожидаемый вывод: "Я школьник."
        schoolStudent.introduce();
    }
}