package ru.javarush.java.core.level29.task01;

import java.util.HashSet;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        // HashSet хранит только уникальные элементы по equals/hashCode
        HashSet<City> cities = new HashSet<>();

        // Добавляем два разных объекта с одинаковыми значениями полей
        cities.add(new City("Метрополис", 1_000_000));
        cities.add(new City("Метрополис", 1_000_000)); // дубликат по содержимому

        // Если equals/hashCode реализованы корректно, размер будет 1
        System.out.println(cities.size());
    }
}