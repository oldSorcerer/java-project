package ru.javarush.java.core.level14.task07;

public class Counter {
    private int currentValue;

    public void increment() {
        currentValue++;
    }

    public void printValue() {
        System.out.println(currentValue);
    }
}
