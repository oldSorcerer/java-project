package ru.javarush.java.core.level27.task09;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаём список, содержащий и целые, и дробные числа
        List<Number> assets = List.of(1, 2.5, 3);

        // Вызываем универсальный метод суммирования и выводим результат
        double total = sumNumbers(assets);
        System.out.println(total); // ожидаем 6.5
    }

    // Универсальный метод: принимает список любых подтипов Number (wildcard ? extends Number)
    public static double sumNumbers(List<? extends Number> list) {

        // Проходим по всем числам и суммируем их как double
        return list.stream().mapToDouble(Number::doubleValue).sum();
    }
}