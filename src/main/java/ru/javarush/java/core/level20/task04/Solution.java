package ru.javarush.java.core.level20.task04;

public class Solution {
    public static void main(String[] args) {
        // "Зоопарк" — массив, который хранит объекты, умеющие издавать звук
        Soundable[] zoo = new Soundable[2];

        // Добавляем одного Dog и одного Cat
        zoo[0] = new Dog();
        zoo[1] = new Cat();

        // Просим каждое животное по очереди издать звук
        for (Soundable animal : zoo) {
            animal.makeSound();
        }
    }
}