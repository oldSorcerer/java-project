package ru.javarush.java.core.level15.task11;

// Класс Solution — точка входа в программу
public class Solution {
    public static void main(String[] args) {
        // Создаем объект "умной лампы" (по умолчанию выключена)
        SmartLamp lamp = new SmartLamp();

        // Включаем лампу
        lamp.setCurrentlyOn(true);

        // Проверяем состояние через boolean-геттер и выводим результат
        System.out.println(lamp.isCurrentlyOn());
    }
}

// Класс SmartLamp инкапсулирует состояние лампы