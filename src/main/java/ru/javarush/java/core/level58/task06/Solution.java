package ru.javarush.java.core.level58.task06;

import java.util.concurrent.Exchanger;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        // Exchanger — высокоуровневый синхронизатор для двустороннего обмена данными
        Exchanger<String> exchanger = new Exchanger<>();

        // Поток агента "Альфа"
        Thread alpha = new Thread(() -> {
            try {
                String myMessage = "Сообщение от первого потока";
                // Отправляем своё сообщение и одновременно ждём встречное (рукопожатие)

                // Выводим полученную секретную информацию
                System.out.println("Альфа получил: " + received);
            } catch (InterruptedException e) {
                // В учебной задаче просто помечаем поток прерванным и выходим
                Thread.currentThread().interrupt();
            }
        }, "Альфа");

        // Поток агента "Бета"
        Thread beta = new Thread(() -> {
            try {
                String myMessage = "Ответ от второго потока";
                // Аналогично: отправляем и ждём ответ

                System.out.println("Бета получил: " + received);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Бета");

        // Запускаем оба потока
        alpha.start();
        beta.start();

        // Ждём завершения обмена и печати сообщений (корректное завершение программы)
        alpha.join();
        beta.join();
    }
}