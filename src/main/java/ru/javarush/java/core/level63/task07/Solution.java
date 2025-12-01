package ru.javarush.java.core.level63.task07;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    // Держим ссылки на большие объекты в статическом списке — GC не сможет их собрать.
    private static final List<byte[]> memoryHog = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        // Небольшая подсказка: PID удобно видеть в VisualVM (имя формата pid@hostname)
        String pid = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println("PID процесса: " + pid);
        System.out.println("Имитация утечки памяти запущена. Подключитесь через VisualVM -> Monitor -> Heap Dump.");

        long totalMB = 0;
        try {
            while (true) {
                // Создаем большой объект (1 МБ) и сохраняем ссылку в список — так имитируем утечку
                byte[] chunk = new byte[1024 * 1024];
                memoryHog.add(chunk);

                totalMB++;
                // Периодически печатаем прогресс, чтобы видеть рост
                if (totalMB % 32 == 0) {
                    System.out.println("Накоплено ~" + totalMB + " МБ в byte[]");
                }

                // Небольшая пауза, чтобы рост был плавным и было удобно подключаться профилировщиком
                Thread.sleep(50);
            }
        } catch (OutOfMemoryError oom) {
            // Когда память закончится, держим процесс "живым" какое-то время для анализа Heap Dump
            System.out.println("OutOfMemoryError: память исчерпана. Оставляем процесс активным на 60 секунд для анализа...");
            Thread.sleep(60_000);
        }
    }
}