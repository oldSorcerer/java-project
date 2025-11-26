package ru.javarush.java.core.level54.task03;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем "пункт управления дроном" — пул из одного потока,
        // который гарантирует выполнение только одной задачи одновременно


        try {
            // Описываем "миссию" дрона как Callable: он вернет отчет-строку по завершении


            // Отправляем миссию на выполнение через пункт управления


            // Ожидаем результат выполнения и выводим отчет на экран

        } finally {
            // Аккуратно завершаем работу пункта управления, чтобы дрон "вернулся на зарядку"

        }
    }
}