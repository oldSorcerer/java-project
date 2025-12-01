package ru.javarush.java.core.level63.task10;

import java.util.ArrayList;

public class Solution {
    // Статическое поле — держит ссылки на массивы и не позволяет GC их освободить (имитация утечки)
    private static final ArrayList<byte[]> storage = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        // PID удобен, чтобы найти процесс в VisualVM
        long pid = ProcessHandle.current().pid();
        System.out.println("Имитация утечки памяти запущена. PID: " + pid);
        System.out.println("Подключитесь в VisualVM, наблюдайте рост памяти и сделайте Heap Dump.");

        int seconds = 0;

        // Бесконечный цикл: каждую секунду создаём новый массив на 1 000 000 байт и кладём в список
        while (true) {
            byte[] block = new byte[1_000_000]; // ровно 1 000 000 элементов (≈1 МБ в десятичном смысле)
            storage.add(block);                  // храним сильную ссылку — память не будет освобождена

            seconds++;
            // Небольшой лог, чтобы видеть прогресс. Печать раз в секунду не мешает профилированию.
            System.out.printf("t=%ds: добавлен блок %,d байт; всего блоков: %,d%n",
                    seconds, block.length, storage.size());

            Thread.sleep(1_000); // интервал 1 секунда между аллокациями
        }
    }
}

/*
Как проверить в VisualVM:
1) Скомпилируйте и запустите программу (для быстрого эффекта можно уменьшить кучу):
   javac Solution.java
   java -Xmx128m Solution
2) Откройте VisualVM, подключитесь к процессу по PID из консоли.
3) Наблюдайте рост используемой памяти, сделайте Heap Dump.
4) В дампе основными потребителями памяти будут ArrayList<byte[]> и массивы byte[].
*/