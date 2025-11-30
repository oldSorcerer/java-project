package ru.javarush.java.core.level59.task01;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// "Читатель фрагментов" свитка: читает часть файла с заданной позиции и заданного размера
class ScrollFragmentReader implements Runnable {
    private final long startPosition; // стартовая позиция в файле
    private final long fragmentSize;  // размер фрагмента в байтах

    // Конструктор, принимающий стартовую позицию и размер фрагмента
    public ScrollFragmentReader(long startPosition, long fragmentSize) {
        this.startPosition = startPosition;
        this.fragmentSize = fragmentSize;
    }

    @Override
    public void run() {
        // Если размер фрагмента нулевой, просто выводим сообщение и завершаемся
        if (fragmentSize <= 0) {
            System.out.println("Собран фрагмент свитка с позиции " + startPosition +
                    " размером " + fragmentSize + " байт!");
            return;
        }

        // RandomAccessFile позволяет быстро "перемотать" на нужную позицию (seek)
        try (RandomAccessFile raf = new RandomAccessFile("data.bin", "r")) {
            raf.seek(startPosition); // переходим к стартовой позиции

            byte[] buffer = new byte[8192]; // читаем блоками по 8 КБ
            long remaining = fragmentSize;

            // Читаем ровно fragmentSize байт (или до конца файла, на всякий случай)
            while (remaining > 0) {
                int toRead = (int) Math.min(buffer.length, remaining);
                int read = raf.read(buffer, 0, toRead);
                if (read == -1) {
                    break; // достигли конца файла (на практике не случится — размеры рассчитаны заранее)
                }
                remaining -= read;
            }

            // Сообщаем о завершении работы фрагмента строго по формату
            System.out.println("Собран фрагмент свитка с позиции " + startPosition +
                    " размером " + fragmentSize + " байт!");
        } catch (IOException e) {
            // Для учебной задачи достаточно краткого сообщения об ошибке
            System.err.println("Не удалось прочитать фрагмент с позиции " + startPosition + ": " + e.getMessage());
        }
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        Path file = Paths.get("data.bin");

        // Создаем пул из 4 потоков для параллельного чтения
        
        try {
            // Определяем размер файла
            long fileSize = Files.size(file);

            // Делим на 4 части: первые три — равные, последняя — включает остаток
            long baseChunk = fileSize / 4;

            for (int i = 0; i < 4; i++) {
                // Стартовая позиция i-й части — это i * baseChunk


                // Для последних (четвертой) части берём всё, что осталось,
                // чтобы покрыть весь файл (если деление было нецелым)


                // Отправляем задачу на исполнение

            }
        } finally {
            // Корректно завершаем работу пула и ждём окончания всех задач

        }
    }
}