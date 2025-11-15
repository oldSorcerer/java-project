package ru.javarush.java.core.level17.task09;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Собака лает");
    }
}
