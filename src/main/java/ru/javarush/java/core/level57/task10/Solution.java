package ru.javarush.java.core.level57.task10;

import java.lang.ScopedValue;

public class Solution {
    // Ключ для Scoped Value: хранит только "имя" слота, а не данные.
    // Значения (идентификатор заказа) привязываются к этому ключу в рамках области выполнения.


    public static void main(String[] args) {
        String[] orders = {"Заказ-1", "Заказ-2", "Заказ-3"};

        // Запускаем по одному виртуальному потоку на каждый заказ.
        // Внутри каждого потока связываем идентификатор заказа с ключом ORDER_ID
        // ровно на время выполнения миссии этого дрона (ScopedValue.where(...).run(...)).
        Thread[] drones = new Thread[orders.length];
        for (int i = 0; i < orders.length; i++) {
            String id = orders[i];
            drones[i] = Thread.ofVirtual().start(() ->
                // Привязка контекстного значения только для тела run()
                
            );
        }

        // Ждем завершения всех дронов
        for (Thread drone : drones) {
            try {
                drone.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Миссия дрона: несколько шагов. Каждый шаг логирует текущий заказ из ScopedValue.
    static void droneMission() {
        logAction("подготовка к взлету");
        sleep(200);
        logAction("взлёт и набор высоты");
        sleep(300);
        logAction("следование к точке доставки");
        sleep(250);
        logAction("сброс посылки");
        sleep(200);
        logAction("возвращение на базу");
        sleep(150);
        logAction("миссия завершена");
    }

    // Логируем действие, извлекая идентификатор заказа из текущей области ScopedValue.
    // Важно: ORDER_ID.get() доступен только внутри области, созданной where(...).run(...)
    static void logAction(String action) {
        String order = ORDER_ID.get(); // Изоляция: у каждого потока свое значение
        System.out.println("Выполняется задача для Заказа: " + order + " — " + action);
    }

    // Небольшая пауза, чтобы увидеть параллельную работу
    static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // восстанавливаем флаг прерывания
        }
    }
}