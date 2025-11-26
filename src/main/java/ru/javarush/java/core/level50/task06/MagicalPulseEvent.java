package ru.javarush.java.core.level50.task06;

// Класс, представляющий магический импульс
public class MagicalPulseEvent {
    private final String message; // Сообщение импульса

    // Конструктор для создания объекта с заданным сообщением
    public MagicalPulseEvent(String message) {
        this.message = message;
    }

    // Метод для получения сообщения импульса
    public String getMessage() {
        return message;
    }
}