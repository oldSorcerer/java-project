package ru.javarush.java.core.level31.task10;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Пример входных данных: список целых показателей портфеля
        List<Integer> indicators = List.of(12, -3, 7, 18, 0, -4, 10);

        // Одновременно считаем сумму и среднее с помощью advanced‑коллектора Collectors.teeing
        // Первый коллектор — сумма (summingInt), второй — среднее (averagingInt)
        // Третий аргумент — функция объединения результатов в объект Result


        // Выводим оба значения из объекта Result
        System.out.println(result.totalSum);
        System.out.println(result.averageValue);
    }
}

// Отдельный класс для аккуратного хранения результатов
class Result {
    // Полная сумма всех элементов
    public final int totalSum;
    // Среднее арифметическое всех элементов
    public final double averageValue;

    // Конструктор используется как функция объединения в Collectors.teeing
    Result(int totalSum, double averageValue) {
        this.totalSum = totalSum;
        this.averageValue = averageValue;
    }
}