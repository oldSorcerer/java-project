package ru.javarush.java.core.level22.task05;

public class Solution {
    public static void main(String[] args) {
        // Создаём экземпляр записи для любимой книги
        Book favoriteBook = new Book("Effective Java", "Joshua Bloch");

        // Выводим всю информацию о книге: название и автора
        System.out.println("Название: " + favoriteBook.title());
        System.out.println("Автор: " + favoriteBook.author());
    }
}