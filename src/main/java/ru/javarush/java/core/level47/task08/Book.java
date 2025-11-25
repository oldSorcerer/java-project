package ru.javarush.java.core.level47.task08;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

// Класс-корень XML-документа <book>...</book>

public class Book {
    private String title;
    private String author;

    // Пустой конструктор обязателен для JAXB
    public Book() {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Аннотации @XmlElement сопоставляют элементы XML с полями Java

    public String getTitle() {
        return title;
    }

    // Сеттер нужен для десериализации
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getAuthor() {
        return author;
    }

    // Сеттер нужен для десериализации
    public void setAuthor(String author) {
        this.author = author;
    }
}