package ru.javarush.java.core.level52.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаем и запускаем фоновый сканер безопасности
        SecurityScanner scanner = new SecurityScanner();
        scanner.start();

        // Даем сканеру немного поработать
        try {
            Thread.sleep(100); // короткая задержка
        } catch (InterruptedException e) {
            // В учебном примере игнорируем прерывание ожидания задержки
        }

        // Инициируем корректное завершение работы сканера
        scanner.initiateShutdown();

        // Дожидаемся завершения потока сканера
        try {
            scanner.join();
        } catch (InterruptedException e) {
            // В учебном примере игнорируем прерывание ожидания join
        }

        // Подтверждаем контролируемое выключение
        System.out.println("Security Scanner has ceased operations.");
    }
}