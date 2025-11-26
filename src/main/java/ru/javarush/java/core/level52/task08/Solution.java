package ru.javarush.java.core.level52.task08;

import java.util.concurrent.Semaphore;

public class Solution {
    public static void main(String[] args) {
        // Создаем диспетчера с управлением двумя полосами
        AirTrafficController controller = new AirTrafficController();

        // Уникальные идентификаторы самолётов
        String[] aircrafts = {"Рейс А1", "Рейс В2", "Рейс С3", "Рейс D4"};

        // Запускаем по одному потоку на каждый самолёт
        Thread[] threads = new Thread[aircrafts.length];
        for (int i = 0; i < aircrafts.length; i++) {
            String id = aircrafts[i]; // Локальная копия для лямбды
            threads[i] = new Thread(() -> controller.manageRunwayAccess(id));
            threads[i].start();
        }

        // Дожидаемся завершения всех потоков, чтобы программа не завершилась раньше времени
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}