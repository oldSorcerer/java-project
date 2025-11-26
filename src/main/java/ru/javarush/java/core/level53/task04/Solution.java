package ru.javarush.java.core.level53.task04;

public class Solution {
    public static void main(String[] args) {
        // Два высокоприоритетных потока — «тяжёлые» задачи.
        Thread orbitCalculation = new Thread(() -> {
            // Пустой бесконечный цикл — максимально загружаем CPU без добровольной уступки
            while (true) {
                // ничего не делаем намеренно
            }
        }, "Расчёт Орбиты Спутника");

        Thread lifeSupportControl = new Thread(() -> {
            // Точно такой же пустой бесконечный цикл
            while (true) {
                // ничего не делаем намеренно
            }
        }, "Управление Жизнеобеспечением Станции");

        // Низкоприоритетный поток — периодический «Фоновый Отчёт»
        Thread backgroundReport = new Thread(() -> {
            while (true) {
                System.out.println("Фоновый Отчёт: Я всё ещё жду своей очереди...");

            }
        }, "Генерация Фонового Отчёта");

        // Назначаем приоритеты: у «тяжёлых» — максимум, у отчёта — минимум


        // Запускаем потоки


        // Блокируем основной поток навсегда, чтобы приложение не завершилось сразу.
        // join() здесь никогда не вернётся, это нормально для демонстрации.
        try {
            orbitCalculation.join();
            lifeSupportControl.join();
            backgroundReport.join();
        } catch (InterruptedException ignored) {
        }
    }
}