package ru.javarush.java.core.level55.task01;

import java.util.concurrent.CompletableFuture;

public class Solution {
    public static void main(String[] args) {
        int baseEnergy = 8; // Базовое энергетическое значение

        // Стартуем асинхронную задачу: вычисляем квадрат числа в фоновом потоке


        // Сразу после запуска задачи сообщаем горожанам о старте вычисления
        System.out.println("Вычисление запущено!");

        // Дожидаемся завершения цепочки, чтобы программа не завершилась раньше времени

    }
}