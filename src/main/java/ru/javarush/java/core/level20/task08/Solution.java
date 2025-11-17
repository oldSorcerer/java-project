package ru.javarush.java.core.level20.task08;

public class Solution {
    public static void main(String[] args) {
        // Создаем смартфон и последовательно вызываем его действия
        SmartPhone phone = new SmartPhone();
        phone.turnOn();
        phone.work();
        phone.charge();
    }
}