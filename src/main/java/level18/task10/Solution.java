package ru.javarush.java.core.level18.task10;

public class Solution {
    public static void main(String[] args) {
        // Создаём объект дочернего класса
        ColorPrinter printer = new ColorPrinter();

        // Демонстрация: перегрузка в базовом классе + переопределение в дочернем
        printer.print(5);        // вызовется метод Printer#print(int)
        printer.print("Hello");  // вызовется переопределённый метод ColorPrinter#print(String)
    }
}