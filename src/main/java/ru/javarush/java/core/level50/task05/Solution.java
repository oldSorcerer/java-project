package ru.javarush.java.core.level50.task05;

import java.util.EventObject;

public class Solution {
    public static void main(String[] args) {
        // Создаем событие с произвольным источником и заданным сообщением
        MagicalPulseEvent event = new MagicalPulseEvent(
                "Хрустальная Башня", // источник (произвольный объект)
                "Приветствие из Хрустальной Башни!" // сообщение
        );

        // Извлекаем и выводим сообщение на экран
        System.out.println(event.getPulseMessage());
    }
}