package ru.javarush.java.core.level18.task05;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект "умного" принтера
        MessagePrinter printer = new MessagePrinter();

        // Демонстрируем первый вариант метода: печать строки как есть
        printer.printMessage("Привет, мир!");

        // Демонстрируем второй вариант метода: печать суммы двух чисел
        printer.printMessage(10, 20);
    }
}