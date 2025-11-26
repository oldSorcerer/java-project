package ru.javarush.java.core.level53.task06;

import java.util.concurrent.CopyOnWriteArrayList;

public class Solution {
    public static void main(String[] args) {
        // Создаем потокобезопасный список для имен игроков.


        // Добавляем трех активных игроков
        activePlayers.add("cat");
        activePlayers.add("dog");
        activePlayers.add("mouse");

        // Итерация по списку с помощью for-each и вывод каждого имени
        for (String player : activePlayers) {
            System.out.println(player);
        }
    }
}