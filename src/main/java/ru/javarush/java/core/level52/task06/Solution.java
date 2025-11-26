package ru.javarush.java.core.level52.task06;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Solution {
    public static void main(String[] args) {
        // Моделируем работу приложения с реестром конфигураций
        ConfigurationRegistry registry = new ConfigurationRegistry();

        // Администратор устанавливает новую конфигурацию
        registry.setSetting("apiEndpoint", "https://api.myapp.com/v1");

        // Компонент приложения считывает конфигурацию
        String endpoint = registry.getSetting("apiEndpoint");

        // Выводим полученный URL на экран
        System.out.println(endpoint);
    }
}