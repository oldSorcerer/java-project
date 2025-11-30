package ru.javarush.java.core.level58.task10;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        // Две ссылки, куда потоки сохранят полученные экземпляры менеджера
        AtomicReference<GameResourceManager> ref1 = new AtomicReference<>();
        AtomicReference<GameResourceManager> ref2 = new AtomicReference<>();

        // Барьер, чтобы оба потока одновременно попытались получить экземпляр
        CountDownLatch start = new CountDownLatch(1);

        Thread t1 = new Thread(() -> {
            try {
                start.await(); // ждём общего старта
            } catch (InterruptedException ignored) {}
            ref1.set(GameResourceManager.getManager());
        });

        Thread t2 = new Thread(() -> {
            try {
                start.await(); // ждём общего старта
            } catch (InterruptedException ignored) {}
            ref2.set(GameResourceManager.getManager());
        });

        t1.start();
        t2.start();
        start.countDown(); // одновременно отпускаем оба потока

        t1.join();
        t2.join();

        // Должно вывести true — обе ссылки указывают на один и тот же объект
        System.out.println(ref1.get() == ref2.get());
    }
}