package ru.javarush.java.core.level51.task05;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        // Создаем и запускаем отдельный поток с именем "ProbeMission"


        // Терпеливо ждем завершения работы потока, не вмешиваясь в его выполнение
        // join() блокирует текущий (основной) поток, пока поток probe не завершится


        // После join() поток уже должен быть завершен: проверяем статус
        // Ожидаемое значение — false

    }

    // Простой поток, который делает "какую-то работу" и сам завершает выполнение
    static class ProbeMission extends Thread {
        ProbeMission() {
            super("ProbeMission"); // задаем имя потока
        }

        @Override
        public void run() {
            // Сигнал, что поток начал работу
            System.out.println(getName() + ": Поток работает");

            // Имитация выполнения операций зонда
            for (int step = 1; step <= 3; step++) {
                try {
                    Thread.sleep(200); // короткая пауза как "работа"
                } catch (InterruptedException e) {
                    // В учебной задаче просто корректно завершим поток
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            // Сигнал о завершении миссии
            System.out.println(getName() + ": Завершение миссии");
        }
    }
}