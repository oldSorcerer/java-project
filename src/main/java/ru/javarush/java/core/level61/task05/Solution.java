package ru.javarush.java.core.level61.task05;

import java.util.concurrent.TimeUnit;

public class Solution {
    public static void main(String[] args) throws Exception {
        String os = System.getProperty("os.name").toLowerCase();

        // Команда зависит от ОС
        var command = os.contains("win")
                ? new String[]{"ping", "-t", "127.0.0.1"}     // Windows: бесконечный пинг
                : new String[]{"ping", "-c", "100", "127.0.0.1"}; // Linux/macOS: 100 пакетов



        // Даем поработать 2 секунды


        // Завершаем и ждём


        System.out.println("Процесс был завершён принудительно");
    }
}