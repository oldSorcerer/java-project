package ru.javarush.java.core.level22.task01;

public class Solution {
    public static void main(String[] args) {
        // Создаем карточку для любимой книги, заполняя оба поля
        BookCard favorite = new BookCard("Мастер и Маргарита", "Михаил Булгаков");

        // Выводим все детали книги на экран
        System.out.println("Название: " + favorite.title());
        System.out.println("Автор: " + favorite.author());
    }
}