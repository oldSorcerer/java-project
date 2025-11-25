package ru.javarush.java.core.level47.task07;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

// Помечаем класс как корневой элемент XML <book>...</book>

// Явно задаем порядок элементов в XML: сначала <title>, затем <author>

public class Book {
    // Приватные поля по условию задачи
    private String title;
    private String author;

    public Book() {
        // Публичный конструктор без параметров обязателен для JAXB
    }

    // Дополнительный удобный конструктор (не обязателен, но полезен для примеров и тестов)
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Публичные геттеры и сеттеры по условию задачи
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}