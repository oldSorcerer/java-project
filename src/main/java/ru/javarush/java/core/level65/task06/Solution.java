package ru.javarush.java.core.level65.task06;

public class Solution {
    public static void main(String[] args) {
        // Создаем переменную типа Animal и "принимаем" собаку по кличке Rex
        Animal currentPet = new Dog("Rex");

        // Используем pattern matching в switch:

        

    }
}

// Sealed-интерфейс ограничивает допустимые реализации строго тремя классами
sealed interface Animal permits Cat, Dog, Parrot { }

// Каждая реализация final и содержит поле String name
final class Cat implements Animal {
    public final String name; // оставим публичным для простоты демонстрации
    public Cat(String name) {
        this.name = name;
    }
}

final class Dog implements Animal {
    public final String name;
    public Dog(String name) {
        this.name = name;
    }
}

final class Parrot implements Animal {
    public final String name;
    public Parrot(String name) {
        this.name = name;
    }
}