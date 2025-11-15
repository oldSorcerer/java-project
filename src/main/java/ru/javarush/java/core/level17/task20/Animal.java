package ru.javarush.java.core.level17.task20;

public class Animal {

    public void makeSound() {
        System.out.println("Some sound");
    }

    public  void sleep() {
        System.out.println("Animal is going to sleep...");
        makeSound();
    }


}
