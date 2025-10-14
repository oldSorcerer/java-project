package ru.javarush.java.core.level16.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаём дом с общим адресом
        House house = new House("Sunny Valley Lane");

        // Через объект внешнего класса создаём объект внутреннего класса.
        // Синтаксис house.new Room(...) обязателен для non-static inner класса.
        House.Room room = house.new Room("Master Bedroom");

        // Выводим идентификатор комнаты и общий адрес дома
        room.printAddresses();
    }
}