package ru.javarush.java.core.level14.task03;

public class Solution {
    public static void main(String[] args) {
        // Создаем одну конкретную книгу
        Book book = new Book();
        book.title = "Java для начинающих";
        book.pages = 350;

        // Просим книгу "рассказать о себе"
        book.printInfo();
    }
}