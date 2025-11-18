package ru.javarush.java.core.level23.task12.zoo;

public class Animal {
    // Защищённый метод: доступен внутри класса, его наследникам и классам в том же пакете
    protected void makeSound() {
        System.out.println("Some sound");
    }
}