package ru.javarush.java.core.level18.task04;

public class Solution {
    public static void main(String[] args) {
        // Формируем колонну транспорта для парада: массив базового типа Vehicle
        // Полиморфизм: хотя массив Vehicle[], фактически в нём разные потомки
        Vehicle[] parade = {
                new Car(),
                new Bicycle(),
                new Scooter() // новый тип транспорта добавлен без изменения логики обхода
        };

        // Единый код обхода — для каждого элемента вызываем move()
        // Благодаря переопределению у каждого типа будет свой вывод
        for (Vehicle v : parade) {
            v.move();
        }
    }
}