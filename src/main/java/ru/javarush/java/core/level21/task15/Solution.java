package ru.javarush.java.core.level21.task15;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект и вызываем default-метод как метод экземпляра
        NumberPrinter printer = new NumberPrinter();
        printer.printSquare(5); // вывод: 25

        // Вызываем static-метод интерфейса напрямую через имя интерфейса
        MathHelper.printCube(3); // вывод: 27
    }
}