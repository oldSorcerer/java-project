package ru.javarush.java.core.level65.task04;

public class Solution {
    public static void main(String[] args) {
        // "Приютим" неизвестное животное: переменная типа Animal с объектом Cat


        // Pattern matching для instanceof:
        // если unknownPet — это Cat, то внутри блока доступна переменная cat типа Cat



        // Для других типов (не Cat и не Dog) ничего не выводим.
    }
}

// Пустой базовый класс-маркер
class Animal { }

// Класс Cat — наследник Animal
class Cat extends Animal { }

// Класс Dog — наследник Animal
class Dog extends Animal { }