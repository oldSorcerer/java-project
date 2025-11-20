package ru.javarush.java.core.level29.task05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список для хранения книг
        List<Book> catalog = new ArrayList<>();

        // Добавляем три книги; у двух — одинаковый год издания, но разные названия
        catalog.add(new Book("Компиляторы", 1990));
        catalog.add(new Book("Алгоритмы", 2000));
        catalog.add(new Book("Структуры данных", 2000));

        // Сортируем список согласно логике compareTo в классе Book
        Collections.sort(catalog);

        // Выводим названия книг по порядку после сортировки
        for (Book book : catalog) {
            System.out.println(book.getBookTitle());
        }
    }
}