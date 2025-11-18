package ru.javarush.java.core.level23.task10;

public class Solution {
    public static void main(String[] args) {
        // "Выкладываем" товар на полку — создаем объект Product
        Product product = new Product();

        // Устанавливаем цену товара через публичный сеттер (прямого доступа к полю нет)
        product.setPrice(49.99);

        // Считываем цену через геттер и выводим на экран — контролируемый доступ к данным
        double currentPrice = product.getPrice();
        System.out.println(currentPrice);
    }
}