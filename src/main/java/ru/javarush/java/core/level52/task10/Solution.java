package ru.javarush.java.core.level52.task10;

public class Solution {
    public static void main(String[] args) {
        // Создаем один общий для всех потоков принтер
        OfficePrinter printer = new OfficePrinter();

        // Набор "документов", которые разные пользователи отправят в печать
        String[] documents = {
                "Документ A\nСтраница 1\nСтраница 2\nСтраница 3",
                "Документ B\nСодержимое B1\nСодержимое B2\nСодержимое B3",
                "Документ C >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>",
                "Документ D\nПервый абзац.\nВторой абзац.\nТретий абзац."
        };

        // Запускаем несколько потоков, каждый отправляет свой документ в печать
        Thread[] threads = new Thread[documents.length];
        for (int i = 0; i < documents.length; i++) {
            final String content = documents[i];
            threads[i] = new Thread(() -> printer.printDocument(content), "User-" + (i + 1));
        }

        // Стартуем все потоки
        for (Thread t : threads) {
            t.start();
        }

        // Ждем завершения всех печатных заданий
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException ignored) {
                // В учебной задаче можно не обрабатывать подробно
            }
        }
    }
}