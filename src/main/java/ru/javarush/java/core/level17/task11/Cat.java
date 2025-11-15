package ru.javarush.java.core.level17.task11;

public class Cat extends Animal {
    String name = "Кошка";

    public void printNames() {
        System.out.println("Имя из Cat: " + name);
        System.out.println("Имя из Animal: " + super.name);
    }
}
