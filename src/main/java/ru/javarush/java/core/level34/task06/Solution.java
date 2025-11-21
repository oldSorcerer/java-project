package ru.javarush.java.core.level34.task06;

import java.util.concurrent.CopyOnWriteArrayList;

public class Solution {
    public static void main(String[] args) {
        // Создаем потокобезопасный список, поддерживающий "снимок" при итерации
        CopyOnWriteArrayList<String> eventLog = new CopyOnWriteArrayList<>();

        // Добавляем начальные события до начала итерации
        eventLog.add("Событие A");
        eventLog.add("Событие B");
        eventLog.add("Событие C");

        // Идем по коллекции с помощью for-each.


        // После завершения цикла выводим итоговое содержимое коллекции:
        // здесь будут видны добавленные во время итерации элементы "Новое событие D"
        System.out.println("Итоговое состояние журнала событий:");

    }
}