package ru.javarush.java.core.level22.task09;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект книги с произвольными значениями
        Book book = new Book("Чистый код", "Роберт Мартин");

        // Печатаем объект: будет использован автогенерированный toString() записи
        System.out.println(book);
    }
}