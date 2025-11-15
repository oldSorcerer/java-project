package ru.javarush.java.core.level18.task20;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void makeSound();

    public String getName() {
        return name;
    }
}
