package ru.javarush.java.core.level22.task12;

import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        // Создаем два товара с одинаковым названием и разной ценой
        Product p1 = new Product("Кружка", 199.99);
        Product p2 = new Product("Кружка", 149.49);

        // Проверяем эквивалентность по equals (ожидаем true)
        System.out.println(p1.equals(p2));

        // Проверяем совпадение хеш-кодов (ожидаем true)
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}