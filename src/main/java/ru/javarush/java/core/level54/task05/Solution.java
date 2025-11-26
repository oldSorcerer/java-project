package ru.javarush.java.core.level54.task05;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаём коллекцию артефактов с числами от 1 до 1000
        List<Integer> artifacts = new ArrayList<>(1000);
        for (int i = 1; i <= 1000; i++) {
            artifacts.add(i);
        }

        // Суммируем квадраты значений, используя параллельный поток


        // Выводим результат
        System.out.println(totalEnergy);
    }
}