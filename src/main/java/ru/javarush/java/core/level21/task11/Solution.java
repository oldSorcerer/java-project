package ru.javarush.java.core.level21.task11;

public class Solution {
    public static void main(String[] args) {
        // Создаем конкретную реализацию интерфейса Printer
        ConsolePrinter printer = new ConsolePrinter();

        // Вызываем default-метод интерфейса, который печатает сообщение дважды
        printer.printTwice("Java");
    }
}