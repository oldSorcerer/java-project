package ru.javarush.java.core.level52.task05;

import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    public static void main(String[] args) {
        // Создаём менеджер склада
        InventoryManager manager = new InventoryManager();

        // Имитация поступления товара: увеличиваем запас на 1
        manager.adjustStockLevel();

        // Немедленно читаем текущее значение и выводим его
        int current = manager.getCurrentStock();
        System.out.println(current); // ожидаем 1
    }
}