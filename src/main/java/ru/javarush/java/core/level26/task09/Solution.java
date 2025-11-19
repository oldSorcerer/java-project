package ru.javarush.java.core.level26.task09;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем дженерик-коллекцию для хранения книг (каталог)
        List<Book> list = new ArrayList<>();

        // Добавляем две разные книги с разными названиями и авторами
        list.add(new Book("Чистый код", "Роберт Мартин"));
        list.add(new Book("Эффективная Java", "Джошуа Блох"));

        // Перебираем каталог и выводим название и автора каждой книги
        list.forEach(System.out::println);
    }
}

// Отдельный класс, представляющий книгу: хранит название и автора
class Book {
    private final String title;
    private final String author;

    // Конструктор инициализирует поля книги
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Геттеры для доступа к полям
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " - " + author;
    }
}