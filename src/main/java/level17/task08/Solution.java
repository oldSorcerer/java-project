package ru.javarush.java.core.level17.task08;

public class Solution {
    public static void main(String[] args) {
        // Создаём специализированную корзину для яблок
        AppleBasket appleBasket = new AppleBasket();

        // Ковариантность: метод AppleBasket.getFruit() возвращает Apple,
        // но мы можем сохранить результат в переменную типа Fruit
        Fruit harvestedItem = appleBasket.getFruit();

        // Проверяем, действительно ли из корзины пришло яблоко
        if (harvestedItem instanceof Apple) {
            System.out.println("Apple created");
        }
    }
}