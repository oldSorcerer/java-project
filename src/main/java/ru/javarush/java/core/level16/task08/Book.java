package ru.javarush.java.core.level16.task08;

public class Book {
    private String bookTitle;
    private int pageCount;

    private Book(Builder builder) {
        this.bookTitle = builder.title;
        this.pageCount = builder.pages;
    }

    @Override
    public String toString() {
        return "Book: %s, %d pages.".formatted(bookTitle, pageCount);
    }

    public static class Builder {
        private String title;
        private int pages;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
