package ru.javarush.java.core.level23.task12.zoo;

// Наследник Animal
public class Dog extends Animal {

    public Dog() {
        // В наследнике доступ к protected-методу разрешён — вызов сработает
        makeSound();
    }

    public void testCall() {
        // Можно вызывать protected-метод и из других методов наследника
        this.makeSound();
    }
}