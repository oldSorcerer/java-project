package ru.javarush.java.core.level33.task07;

import java.util.List;
import java.util.Spliterator;

public class Solution {
    public static void main(String[] args) {
        // Список номеров посылок от 1 до 5
        List<Integer> documentStack = List.of(1, 2, 3, 4, 5);

        // Получаем Spliterator у списка


        // Обрабатываем только первый элемент: tryAdvance вызываем ровно один раз
        // Consumer печатает значение на экран
        spliterator.tryAdvance(System.out::println);
    }
}