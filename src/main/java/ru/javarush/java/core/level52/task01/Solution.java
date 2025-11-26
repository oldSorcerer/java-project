package ru.javarush.java.core.level52.task01;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        // Создаём один общий экземпляр счётчика для всех потоков
        WidgetCounter counter = new WidgetCounter();

        // Задача для "производственной линии": 5000 раз увеличить счётчик
        Runnable lineTask = () -> {
            for (int i = 0; i < 5000; i++) {
                counter.recordProduction(); // безопасный инкремент
            }
        };

        // Запускаем три отдельные "производственные линии" (три потока)
        Thread t1 = new Thread(lineTask, "Line-1");
        Thread t2 = new Thread(lineTask, "Line-2");
        Thread t3 = new Thread(lineTask, "Line-3");

        t1.start();
        t2.start();
        t3.start();

        // Дожидаемся завершения всех трёх потоков
        t1.join();
        t2.join();
        t3.join();

        // Выводим итоговое значение: должно быть ровно 15000
        System.out.println(counter.totalWidgetsProduced);
    }
}