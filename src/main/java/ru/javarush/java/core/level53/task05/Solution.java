package ru.javarush.java.core.level53.task05;

import java.util.concurrent.ConcurrentHashMap;

public class Solution {
    public static void main(String[] args) {
        // Создаем потокобезопасную карту: ключ — название товара, значение — количество


        // Добавляем данные о поставках
        inventory.put("apple", 2);
        inventory.put("banana", 5);
        inventory.put("orange", 3);

        // Получаем количество бананов по ключу "banana"
        Integer bananas = inventory.get("banana");

        // Выводим количество бананов на экран
        System.out.println(bananas);
    }
}