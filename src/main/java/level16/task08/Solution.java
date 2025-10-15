package ru.javarush.java.core.level16.task08;

public class Solution {
    public static void main(String[] args) {
        // Создаем книгу через статический вложенный класс Builder
        Book book = new Book.Builder()
                .setTitle("Java Basics")
                .setPages(500)
                .build();

        // Выводим информацию о книге (toString() возвращает строку в нужном формате)
        System.out.println(book);
    }
}