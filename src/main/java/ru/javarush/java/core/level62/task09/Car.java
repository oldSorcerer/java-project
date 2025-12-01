package ru.javarush.java.core.level62.task09;

public class Car {
    @Inject
    private Engine engine; // Приватное поле, в которое нужно "внедрить" Engine

    public Car() {
        // Публичный конструктор без параметров
    }

    // Геттер для проверки результата внедрения
    public Engine getEngine() {
        return engine;
    }
}