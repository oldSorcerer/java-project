package ru.javarush.java.core.level62.task08;

// Класс книги с приватными полями и публичными геттерами
public class Book {
    private String title;
    private int pages;

    // Публичный конструктор с параметрами
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    // Публичные геттеры
    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
}