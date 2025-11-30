package ru.javarush.java.core.level59.task09;

import java.util.concurrent.ArrayBlockingQueue;

public class Solution {
    // Специальный маркер завершения (poison pill)
    private static final String POISON_PILL = "__КОНЕЦ_СМЕНЫ__";

    public static void main(String[] args) throws InterruptedException {
        // Создаем склад-конвейер вместимостью 5 элементов


        // Запускаем потребителя в отдельном потоке
        Thread consumer = new Thread(() -> {

            
        });

        consumer.start();

        // Основной поток — producer: кладем две партии сырья и затем сигнал завершения


        // Ждем корректного завершения потока-потребителя
        consumer.join();
    }
}