package ru.javarush.java.core.level15.task04;

public class Product {
    private int productID;
    private String productName;

    public Product(int productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }


    public String getProductName() {
        return productName;
    }


}
