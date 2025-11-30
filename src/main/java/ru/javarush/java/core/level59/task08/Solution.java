package ru.javarush.java.core.level59.task08;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    // Максимальный размер фрагмента — 10 МБ
    private static final long CHUNK_SIZE = 10L * 1024 * 1024;

    public static void main(String[] args) throws Exception {
        // Используем демонстрационный manuscript.txt
        Path path = Path.of("manuscript.txt");

        long fileSize = java.nio.file.Files.size(path);
        if (fileSize == 0) {
            System.out.println(0);
            return;
        }

        // Считаем количество фрагментов по 10 МБ (последний может быть меньше)
        int chunks = (int) ((fileSize + CHUNK_SIZE - 1) / CHUNK_SIZE);

        // Размер пула потоков — не больше количества фрагментов и числа доступных ядер


        try {
            List<Future<Long>> futures = new ArrayList<>(chunks);

            // Создаем и запускаем задачи для каждого фрагмента [start, end)
            for (int i = 0; i < chunks; i++) {
                long start = i * CHUNK_SIZE;
                long end = Math.min(start + CHUNK_SIZE, fileSize);

            }

            // Ждем завершения всех задач и суммируем результаты
            long totalNewlines = 0;
            for (Future<Long> f : futures) {
                totalNewlines += f.get(); // получаем количество '\n' в конкретном фрагменте
            }

            // Выводим итоговое количество строк (по условию — считаем символы новой строки '\n')
            System.out.println(totalNewlines);
        } finally {
            
        }
    }
}

// Задача подсчета '\n' в заданном диапазоне файла [start, end)
class NewlineCountTask implements Callable<Long> {
    private final Path path;
    private final long start; // включительно
    private final long end;   // исключительно

    NewlineCountTask(Path path, long start, long end) {
        this.path = path;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        long count = 0;

        // Открываем свой FileChannel в каждом таске — просто и наглядно
        // Читаем данные "позиционными" вызовами read(..., position),
        // чтобы никогда не выйти за границы фрагмента.
        try (FileChannel channel = FileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(256 * 1024); // 256 КБ буфер

            long pos = start;
            while (pos < end) {
                buffer.clear();

                // Сколько байт осталось в нашем фрагменте
                int toRead = (int) Math.min(buffer.capacity(), end - pos);
                buffer.limit(toRead);

                // Позиционное чтение строго с места pos
                int read = channel.read(buffer, pos);
                if (read <= 0) {
                    break; // достигнут конец файла (или временная ситуация), выходим
                }

                buffer.flip();
                // Считаем символы новой строки '\n' (ASCII 0x0A). Кодировка не важна — считаем байты.
                while (buffer.hasRemaining()) {
                    if (buffer.get() == (byte) '\n') {
                        count++;
                    }
                }

                pos += read;
            }
        }

        // Никаких корректировок по границам не нужно:
        // каждый '\n' принадлежит ровно одному фрагменту, двойного или пропущенного подсчета не произойдет.
        return count;
    }
}