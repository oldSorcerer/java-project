package ru.javarush.java.core.level29.task03;

public class Solution {
    public static void main(String[] args) {
        // Создаем книгу с конкретными названием и автором
        Book book = new Book("Clean Code", "Robert C. Martin");

        // Выводим вычисленный хеш-код объекта Book
        System.out.println(book.hashCode());
    }
}