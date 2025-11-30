package ru.javarush.java.core.level59.task02;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

//Главный класс c запуском пяти потоков, каждый пишет по 10 сообщений в общий файл.
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        StationLogManager logManager = new StationLogManager();

        List<Thread> threads = new ArrayList<>();
        for (int module = 1; module <= 5; module++) {
            final int moduleId = module;

            // Каждый поток пишет 10 уникальных сообщений
            Runnable task = () -> {
                for (int i = 1; i <= 10; i++) {
                    String message = "Module-" + moduleId + " | report #" + String.format("%02d", i);
                    logManager.recordEvent(message);

                    // Небольшая пауза для большего перемешивания потоков (проявить синхронизацию)
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            };

            Thread t = new Thread(task, "Module-" + moduleId);
            threads.add(t);
            t.start();
        }

        // Дожидаемся завершения всех потоков
        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Запись завершена. Проверьте файл station_events.log");
    }
}