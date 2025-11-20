package ru.javarush.java.core.level29.task06;

import java.util.Objects;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        // Создаем два разных объекта City с одинаковыми значениями полей
        City city1 = new City("Springfield", 100_000);
        City city2 = new City("Springfield", 100_000);

        // TreeSet автоматически сортирует элементы и не добавляет "дубликаты"
        // (дубликатом считается элемент с compareTo == 0)
        TreeSet<City> cities = new TreeSet<>();
        cities.add(city1);
        cities.add(city2);

        // Ожидаем размер 1, так как города идентичны по всем полям
        System.out.println(cities.size());
    }
}