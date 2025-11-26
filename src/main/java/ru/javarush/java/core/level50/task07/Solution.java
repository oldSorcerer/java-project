package ru.javarush.java.core.level50.task07;

// Небольшая демонстрация работы агентства.
public class Solution {
    public static void main(String[] args) {
        TechNewsAgency agency = new TechNewsAgency();
        // Имитируем публикацию заголовка без рассылки подписчикам
        agency.broadcastNews("Java 25 выпущена! Новые возможности уже здесь.");
    }
}