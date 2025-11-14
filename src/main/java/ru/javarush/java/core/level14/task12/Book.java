package ru.javarush.java.core.level14.task12;

public class Book {
    private String bookTitle;
    private int numberOfPages;

    public Book() {
        bookTitle = "Без названия";
        numberOfPages = 0;
    }

    public Book(String bookTitle, int numberOfPages) {
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
