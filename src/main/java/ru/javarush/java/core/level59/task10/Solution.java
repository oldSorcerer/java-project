package ru.javarush.java.core.level59.task10;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        // Создаём блокирующую очередь с ограничением на 10 элементов
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        // Запускаем producer в отдельном потоке
        Thread producerThread = new Thread(new Producer(queue));
        producerThread.start();

        // Запуск двух consumer-потоков (дронов) с номерами 1 и 2
        Thread consumer1 = new Thread(new Consumer(queue, 1));
        Thread consumer2 = new Thread(new Consumer(queue, 2));
        consumer1.start();
        consumer2.start();

        // Ожидаем завершения всех трёх потоков, чтобы программа корректно завершилась
        producerThread.join();
        consumer1.join();
        consumer2.join();
    }
}