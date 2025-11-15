package ru.javarush.java.core.level17.task16;

public class Cat extends Mammal {

    @Override
    public void eat() {
        System.out.printf("%s ест рыбу.%n", animalName);
    }

    public void purr() {
        System.out.printf("%s мурлычет.%n", animalName);
    }
}
