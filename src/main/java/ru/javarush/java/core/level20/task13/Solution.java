package ru.javarush.java.core.level20.task13;

public class Solution {
    public static void main(String[] args) {
        // Создаем переменную типа интерфейса и присваиваем ей лямбда-выражение,
        // которое просто печатает полученное сообщение
        MessagePrinter printer = message -> System.out.println(message);

        // Вызываем метод и выводим сообщение на экран
        printer.print("Привет, Java!");
    }
}