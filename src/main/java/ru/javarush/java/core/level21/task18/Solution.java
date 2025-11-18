package ru.javarush.java.core.level21.task18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаём список городов с разным населением
        List<City> cities = new ArrayList<>();
        cities.add(new City("Нью-Йорк", 8400000)); // 8.4 млн
        cities.add(new City("Лондон", 8900000));   // 8.9 млн
        cities.add(new City("Париж", 2100000));    // 2.1 млн

        // Сортируем список стандартным методом Collections.sort
        // Порядок будет по возрастанию населения благодаря compareTo в City
        Collections.sort(cities);

        // Выводим отсортированный список
        for (City city : cities) {
            System.out.println(city);
        }
    }
}