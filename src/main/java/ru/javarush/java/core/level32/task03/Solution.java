package ru.javarush.java.core.level32.task03;

import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Создаем два неизменяемых списка с фруктами из двух корзин
        List<String> firstBasketFruits = List.of("Яблоко", "Груша");
        List<String> secondBasketFruits = List.of("Банан", "Апельсин");

        // Получаем потоки из каждой корзины и объединяем их в один общий поток
        // Используем Stream.concat согласно требованиям задачи


        // Проходим по объединенному потоку и выводим каждый фрукт на новой строке
        allSaladIngredients.forEach(System.out::println);
    }
}