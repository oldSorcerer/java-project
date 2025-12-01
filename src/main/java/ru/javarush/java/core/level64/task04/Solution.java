package ru.javarush.java.core.level64.task04;

public class Solution {
    public static void main(String[] args) {
        // Простая программа: выводит подтверждение запуска.
        // Все настройки GC задаются флагами JVM при старте, а не в коде.
        System.out.println("Приложение запущено с настройками: G1 GC, Xmx=1g, MaxGCPauseMillis=150.");
    }
}