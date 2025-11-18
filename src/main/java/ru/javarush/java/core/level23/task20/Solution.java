package ru.javarush.java.core.level23.task20;

public class Solution {
    public static void main(String[] args) {
        // Создаем один продукт и проверяем работу геттера
        Product banana = new Product("Банан");
        System.out.println(banana.getProductName());
    }
}