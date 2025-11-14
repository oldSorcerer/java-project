package ru.javarush.java.core.level16.task11;

public class ProductionCounter {

    // Публичный метод, в котором создаём анонимный класс Runnable и вызываем его run()
    public void startCountOperation() {
        // Создаём объект интерфейса Runnable с помощью анонимного класса
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Счётчик запущен");
            }
        };

        // Вызываем метод run() прямо внутри startCountOperation()
        runnable.run();
    }

    public static void main(String[] args) {
        // Создаём объект ProductionCounter и запускаем операцию подсчёта
        ProductionCounter counter = new ProductionCounter();
        counter.startCountOperation();
    }
}