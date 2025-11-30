package ru.javarush.java.core.level57.task05;

import java.util.concurrent.CountDownLatch;

public class Solution {
    // Количество "жителей" города — ровно 1000 виртуальных потоков
    private static final int RESIDENTS = 1000;

    public static void main(String[] args) throws InterruptedException {
        // ready — все потоки созданы и готовы; start — общий барьер одновременного старта
        CountDownLatch ready = new CountDownLatch(RESIDENTS);
        CountDownLatch start = new CountDownLatch(1);

        // Храним ссылки, чтобы потом корректно подождать завершение (join)
        Thread[] threads = new Thread[RESIDENTS];

        for (int i = 0; i < RESIDENTS; i++) {
            // Создаем и сразу запускаем виртуальный поток


        }

        // Ждем, пока все 1000 виртуальных потоков будут созданы и готовы
        ready.await();

        // Одновременно "запускаем" их активность
        start.countDown();

        // Подсчитываем количество живых виртуальных потоков в JVM прямо сейчас
        long liveVirtual = countLiveVirtualThreads();
        System.out.println(liveVirtual);

        // Аккуратно завершаем: ждем, пока все потоки доработают
        for (Thread t : threads) {
            t.join();
        }
    }

    // Подсчет всех живых виртуальных потоков внутри JVM:
    // Перебираем все живые потоки и фильтруем только виртуальные (isVirtual()) и живые (isAlive()).
    private static long countLiveVirtualThreads() {
        long count = 0;
        for (Thread t : Thread.getAllStackTraces().keySet()) {

            
        }
        return count;
    }
}