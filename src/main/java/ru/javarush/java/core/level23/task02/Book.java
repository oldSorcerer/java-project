package ru.javarush.java.core.level23.task02;

// Простой класс-категория "Книга" с одним полем и методом.
// Он нужен, чтобы тип Book был доступен проекту и компилировался.
public class Book {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    // Метод, который мы будем пытаться вызвать у null-ссылки
    public String getTitle() {
        return title;
    }
}