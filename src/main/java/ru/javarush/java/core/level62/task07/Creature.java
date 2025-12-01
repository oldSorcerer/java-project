package ru.javarush.java.core.level62.task07;

// Публичный класс Creature с открытым конструктором без параметров
public class Creature {
    // Публичный конструктор без параметров — существо возникает "из чистой энергии"
    public Creature() {
        // Дополнительной инициализации нет
    }

    @Override
    public String toString() {
        // Базовое описание существа
        return "Creature{}";
    }
}