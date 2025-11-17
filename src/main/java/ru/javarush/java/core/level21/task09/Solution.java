package ru.javarush.java.core.level21.task09;

public class Solution {
    public static void main(String[] args) {
        // Создаем устройство и демонстрируем работу методов
        MyCounter device = new MyCounter();
        device.increment(); // должен вывести "Counter incremented"
        device.reset();     // должен вывести "Counter reset"
    }
}