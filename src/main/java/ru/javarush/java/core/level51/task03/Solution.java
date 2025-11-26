package ru.javarush.java.core.level51.task03;

// Главный класс с точкой входа
public class Solution {
    public static void main(String[] args) {
        // Создаем "дрон" — отдельный объект с собственной логикой выполнения
        MessageDrone drone = new MessageDrone();

        // Оборачиваем дрона в поток и запускаем его
        Thread thread = new Thread(drone);
        thread.start(); // Стартуем поток: дрон "взлетает" и выводит сообщение
    }
}