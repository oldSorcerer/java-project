package ru.javarush.java.core.level51.task09;

public class Solution {
    // Общий несинхронизированный счётчик продаж
    static int totalSales = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread[] cashiers = new Thread[100]; // 100 потоков-кассиров

        // Создаём и запускаем 100 потоков
        for (int i = 0; i < cashiers.length; i++) {
            cashiers[i] = new Thread(() -> {

                
            });
            cashiers[i].start();
        }

        // Ожидаем завершения всех потоков перед выводом результата
        for (Thread cashier : cashiers) {
            cashier.join();
        }

        // Итоговое значение (часто окажется меньше 100 из-за состояния гонки)
        System.out.println(totalSales);
    }
}