package ru.javarush.java.core.level18.task20;

public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Мууу!");
    }
}
