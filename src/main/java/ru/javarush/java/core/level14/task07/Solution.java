package ru.javarush.java.core.level14.task07;

public class Solution {
    public static void main(String[] args) {
        // Создаем и "запускаем" счётчик
        Counter counter = new Counter();

        // "Нажимаем кнопку" три раза
        counter.increment();
        counter.increment();
        counter.increment();

        // Просим счётчик показать текущее значение (ожидается число 3)
        counter.printValue();
    }
}