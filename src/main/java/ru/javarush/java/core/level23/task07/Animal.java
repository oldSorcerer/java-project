package ru.javarush.java.core.level23.task07;

// Класс Animal отвечает за любое животное и гарантирует, что у него всегда есть имя
public class Animal {
    // Поле для хранения имени животного
    private final String name;

    // Конструктор, принимающий имя животного
    // В классе нет конструктора без параметров, чтобы нельзя было создать животное без имени
    public Animal(String petName) {
        this.name = petName;
    }

    // Геттер для получения имени животного
    public String getName() {
        return name;
    }
}