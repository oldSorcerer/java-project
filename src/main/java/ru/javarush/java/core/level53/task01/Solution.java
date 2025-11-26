package ru.javarush.java.core.level53.task01;

public class Solution {
    // Два "инструмента" как общие ресурсы (замки)
    // Эти объекты мы используем в synchronized-блоках
    private static final Object WRENCH = new Object();       // Гаечный Ключ
    private static final Object SCREWDRIVER = new Object();  // Отвертка

    public static void main(String[] args) {
        // Поток Робота Альфа: сначала берёт Гаечный Ключ, затем пытается взять Отвертку
        Thread alpha = new Thread(Solution::runAlpha, "Робот-Альфа");

        // Поток Робота Бета: сначала берёт Отвертку, затем пытается взять Гаечный Ключ
        Thread beta = new Thread(Solution::runBeta, "Робот-Бета");

        // Запускаем оба потока почти одновременно
        alpha.start();
        beta.start();

        // Ничего больше не делаем в main: если произойдет взаимная блокировка,
        // программа "застынет", что и демонстрирует deadlock.
    }

    // Логика Робота Альфа
    private static void runAlpha() {

    }

    // Логика Робота Бета
    private static void runBeta() {

    }

    // Небольшой помощник для паузы без лишнего шума
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignored) {
            // В нашей задаче прерывание игнорируем для простоты
        }
    }
}