package ru.javarush.java.core.level14.task18;

public class Solution {
    public static void main(String[] args) {
        // Создаем книгу со стандартными значениями полей
        Book standardBook = new Book();

        // Выводим стандартные значения на экран
        System.out.println(standardBook.bookTitle);
        System.out.println(standardBook.pageCount);
    }
}

// "Шаблон" книги с начальными значениями полей прямо при объявлении