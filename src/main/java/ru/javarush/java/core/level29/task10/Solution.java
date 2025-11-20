package ru.javarush.java.core.level29.task10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем список playerScores и заполняем его в указанном порядке
        List<Integer> playerScores = Arrays.asList(7, 2, 10, 4, 10, 1);

        // Используем Collections.max и Collections.min для поиска экстремумов


        // Выводим максимум и минимум через пробел
        System.out.println(highestScore + " " + lowestScore);
    }
}