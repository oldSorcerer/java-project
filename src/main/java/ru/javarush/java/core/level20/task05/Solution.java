package ru.javarush.java.core.level20.task05;

// Небольшая демонстрация работы: создаем Car и отдаём команду move()
public class Solution {
    public static void main(String[] args) {
        Movable car = new Car(); // полиморфный тип: обращаемся через интерфейс
        car.move();              // вывод: Машина едет
    }
}