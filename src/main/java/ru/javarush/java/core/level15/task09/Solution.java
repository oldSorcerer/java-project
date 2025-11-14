package ru.javarush.java.core.level15.task09;

// Класс Solution — точка входа программы
public class Solution {
    public static void main(String[] args) {
        // Создаем товар с исходным названием "Старый товар"
        Product product = new Product("Старый товар");

        // Переименовываем товар на "Новый товар" с помощью сеттера
        product.setProductName("Новый товар");

        // Выводим обновлённое название с помощью геттера
        System.out.println(product.getProductName());
    }
}

// Класс Product инкапсулирует название товара
class Product {
    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String newProductName) {
        this.productName = newProductName;
    }
}