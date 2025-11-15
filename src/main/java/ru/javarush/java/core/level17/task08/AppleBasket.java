package ru.javarush.java.core.level17.task08;

public class AppleBasket extends Basket {
    @Override
    public Apple getFruit() {
        return new Apple();
    }
}
