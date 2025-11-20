package ru.javarush.java.core.level29.task09;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем список наблюдений животных
        List<String> animalSightings = new ArrayList<>();
        // Заполняем список в нужном порядке
        animalSightings.add("кот");
        animalSightings.add("пёс");
        animalSightings.add("кот");
        animalSightings.add("мышь");

        // Находим индекс первого появления "кот" (встроенный метод List)

        // Находим индекс последнего появления "кот"


        // Выводим оба индекса через пробел
        System.out.println(firstIndex + " " + lastIndex);
    }
}