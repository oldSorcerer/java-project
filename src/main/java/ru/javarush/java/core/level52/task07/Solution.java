package ru.javarush.java.core.level52.task07;

import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    public static void main(String[] args) {
        // Создаем монитор событий
        EventMonitor monitor = new EventMonitor();

        // Имитируем поток событий: вызываем recordEvent() 10 раз
        for (int i = 0; i < 10; i++) {
            monitor.recordEvent();
        }

        // Получаем и выводим итоговое значение счетчика
        System.out.println(monitor.getEventCount());
    }
}