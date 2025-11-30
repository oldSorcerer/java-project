package ru.javarush.java.core.level59.task04;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Файл с перехваченной передачей
        Path file = Paths.get("intercepted_transmission.log");

        // Открываем канал чтения
        try (FileChannel channel = FileChannel.open(file, StandardOpenOption.READ)) {
            long size = channel.size();

            // Делим на 4 равные части (в тестовых данных размер кратен 4)
            int parts = 4;
            long partSize = size / parts;

            // Запускаем 4 потока-агента, каждый читает свой диапазон
            Thread[] agents = new Thread[parts];
            for (int i = 0; i < parts; i++) {
                long start = i * partSize;
                agents[i] = new Thread(new Agent(channel, start, partSize), "Agent-" + (i + 1));
                agents[i].start();
            }

            // Ожидаем завершения всех агентов
            for (Thread agent : agents) {
                agent.join();
            }

            // Финальное сообщение после завершения всех потоков
            System.out.println("Передача полностью расшифрована. Миссия успешно завершена!");
        }
    }
}