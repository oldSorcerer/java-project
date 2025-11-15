package ru.javarush.java.core.level18.task12;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Мяу!");
    }
}
