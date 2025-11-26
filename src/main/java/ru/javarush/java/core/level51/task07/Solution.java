package ru.javarush.java.core.level51.task07;

// Простая демонстрация многопоточности:
// два "агента"-приветствия и один "агент"-обработчик заказа запускаются параллельно.
public class Solution {
    public static void main(String[] args) {
        // Создаем агентов (задачи) с параметрами


        // Оборачиваем задачи в потоки и даем им понятные имена
        Thread t1 = new Thread(greeterAlice, "UserGreeter-Алиса");
        Thread t2 = new Thread(greeterBob, "UserGreeter-Боб");
        Thread t3 = new Thread(handler, "OrderHandler-1001");

        // Запускаем потоки почти одновременно — дальше планировщик решит порядок выполнения


        // В этой задаче ждать завершения потоков (join) не требуется.
    }
}

// Агент-приветствия пользователя. Работает в отдельном потоке через Runnable.
class UserGreeter implements Runnable {
    private final String username; // имя пользователя, передается в конструктор

    public UserGreeter(String username) {

    }

    @Override
    public void run() {
        // Имя потока берем динамически — так видно, какой поток выполняет задачу
        String threadName = Thread.currentThread().getName();
        System.out.printf("Привет, %s из потока %s%n", username, threadName);
    }
}

// Агент-обработчик заказа. Работает в отдельном потоке через Runnable.
class OrderHandler implements Runnable {
    private final int orderNumber; // номер заказа, передается в конструктор

    public OrderHandler(int orderNumber) {

    }

    @Override
    public void run() {
        // Имя потока берем динамически — так видно, какой поток выполняет задачу
        String threadName = Thread.currentThread().getName();
        System.out.printf("Обрабатываю заказ %d в потоке %s%n", orderNumber, threadName);
    }
}