package ru.javarush.java.core.level21.task14;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект ConsolePrinter
        Printer printer = new ConsolePrinter();

        // Используем статический метод интерфейса для вывода приветствия
        Printer.printHello(printer);
    }
}