package ru.javarush.java.core.level14.task03;

public class Book {
    String title;
    int pages;

    public void printInfo() {
        System.out.printf("Название: %s, страниц: %d%n", title, pages);
    }
}
