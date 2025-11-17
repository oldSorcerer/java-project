package ru.javarush.java.core.level19.task15;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Динамический список, способный хранить объекты типа Vehicle (полиморфизм)
        List<Vehicle> vehicles = new ArrayList<>();

        // Добавляем разные виды транспорта
        vehicles.add(new Car("Lada"));
        vehicles.add(new Bicycle("Stels"));

        // Проходим по списку и вызываем move() у каждого транспорта
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}