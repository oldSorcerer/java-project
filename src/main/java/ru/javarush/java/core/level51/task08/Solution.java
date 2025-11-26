package ru.javarush.java.core.level51.task08;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        // Создаем три независимых "робота" с разными задачами и временем выполнения


        // Устанавливаем каждому потоку уникальный приоритет


        // Запускаем все потоки — гарантируем, что каждый робот начнет выполнение своей задачи


        // Ждем завершения всех потоков, чтобы программа не завершилась раньше времени

    }
}

// Класс-исполнитель задачи, реализует логику одного "робота"
class TaskRunner implements Runnable {
    private final String taskName;   // название задачи
    private final long durationMs;   // время выполнения в миллисекундах

    // В конструктор передаем название задачи и время выполнения
    public TaskRunner(String taskName, long durationMs) {
        this.taskName = taskName;
        this.durationMs = durationMs;
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread(); // получаем текущий поток для имени и приоритета

        // Сообщение о старте с указанием имени потока и его приоритета
        System.out.println(current.getName() + ": старт задачи " + taskName + " (приоритет " + current.getPriority() + ")");

        try {
            // Имитируем выполнение задачи
            Thread.sleep(durationMs);
        } catch (InterruptedException e) {
            // В учебной задаче просто сообщаем о прерывании и завершаем работу
            System.out.println(current.getName() + ": задача " + taskName + " прервана");
            return;
        }

        // Сообщение о завершении задачи
        System.out.println(current.getName() + ": завершена задача " + taskName);
    }
}