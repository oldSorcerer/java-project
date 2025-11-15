package ru.javarush.java.core.level18.task10;

public class ColorPrinter extends Printer {
    @Override
    public void print(String string) {
        System.out.println("Цветная строка: " + string);
    }
}
