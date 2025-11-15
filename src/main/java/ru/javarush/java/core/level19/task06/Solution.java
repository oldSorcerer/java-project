package ru.javarush.java.core.level19.task06;

public class Solution {
    public static void main(String[] args) {
        // Создаем "умное" устройство — телефон
        Phone phone = new Phone();

        // Включаем телефон (способ включения индивидуален для каждого устройства)
        phone.turnOn();

        // Выключаем устройство (общий алгоритм для всех устройств)
        phone.turnOff();
    }
}