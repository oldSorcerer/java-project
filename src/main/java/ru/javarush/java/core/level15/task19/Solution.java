package ru.javarush.java.core.level15.task19;

public class Solution {
    public static void main(String[] args) {
        // Создаем два объекта, чтобы увидеть порядок инициализации:
        // 1) При первом создании класса выполняются статические блоки (один раз),
        // 2) Затем для каждого объекта — оба нестатических блока в порядке объявления,
        // 3) После — конструктор.
        new SystemComponent();
        new SystemComponent();
    }
}