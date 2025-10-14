package ru.javarush.java.core.level15.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаём товар с ID 101 и названием "Молоко"
        Product product = new Product(101, "Молоко");

        // Выводим данные через геттеры
        System.out.println(product.getProductID());
        System.out.println(product.getProductName());

        // Попытки изменить поля напрямую или через сеттеры невозможны:
        product.productID = 202;          // ошибка компиляции: поле private
        product.productName = "Кефир";    // ошибка компиляции: поле private
        product.setProductID(202);        // ошибка компиляции: метода нет
        product.setProductName("Кефир");  // ошибка компиляции: метода нет
    }
}