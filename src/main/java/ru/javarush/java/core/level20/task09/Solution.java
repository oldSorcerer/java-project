package ru.javarush.java.core.level20.task09;

public class Solution {
    public static void main(String[] args) {
        // Создаём универсальный объект, который умеет выполнять оба контракта
        Sketch sketch = new Sketch();

        // Демонстрация работы: сначала рисуем, затем стираем
        sketch.draw();
        sketch.erase();
    }
}