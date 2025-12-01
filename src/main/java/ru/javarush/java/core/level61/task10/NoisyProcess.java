package ru.javarush.java.core.level61.task10;

public class NoisyProcess {
    public static void main(String[] args) {
        // Этот процесс генерирует вывод и в stdout, и в stderr,
        // имитируя "подозрительный" процесс из условия задачи.
        // Небольшие паузы помогают перемешать вывод потоков.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Сообщение stdout #" + i);
            sleep(60);
            System.err.println("Предупреждение stderr #" + i);
            sleep(60);
        }
    }

    // Простой помощник для паузы между выводами (чтобы чередование было нагляднее)
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignored) {
            Thread.currentThread().interrupt();
        }
    }
}