package ru.javarush.java.core.level23.task04;

// Публичный класс Product — модель товара
public class Product {
    // Приватное строковое поле — имя товара недоступно напрямую извне
    private String productName;

    // Конструктор, который обязательно принимает имя товара
    public Product(String productName) {
        // Сразу сохраняем переданное имя в приватное поле
        this.productName = productName;
    }

    // Геттер для чтения имени товара (само поле остаётся private)
    public String getProductName() {
        return productName;
    }

}