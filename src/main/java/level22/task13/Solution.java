package ru.javarush.java.core.level22.task13;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект температуры по значению в Фаренгейтах (212°F — кипение воды)
        Temperature boiling = Temperature.fromFahrenheit(212);

        // Выводим значение в градусах Цельсия
        System.out.println(boiling.celsius());
    }
}