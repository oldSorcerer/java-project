package ru.javarush.java.core.level53.task09;

public class Solution {
    public static void main(String[] args) {
        // На самом старте программы получаем ссылку на текущий поток
        Thread current = Thread.currentThread();

        // Получаем имя и состояние текущего потока


        // Выводим информацию в консоль
        System.out.println("Имя потока: " + name);
        System.out.println("Состояние потока: " + state);
    }
}