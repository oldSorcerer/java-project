package ru.javarush.java.core.level22.task12;

import java.util.Objects;

public record Product(String name, double price) {

    @Override
    public boolean equals(Object o) {
        if (this  == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
