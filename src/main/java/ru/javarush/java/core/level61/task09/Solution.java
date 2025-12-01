package ru.javarush.java.core.level61.task09;

import java.io.BufferedReader;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Подбираем "запретную" команду: Windows → mkdir в C:\Windows, Unix → touch в /
        boolean isWindows = System.getProperty("os.name").toLowerCase().contains("win");
        List<String> command = isWindows
                ? List.of("cmd", "/c", "mkdir", "C:\\Windows\\forbidden_test_" + System.currentTimeMillis())
                : List.of("sh", "-c", "touch /forbidden_test_" + System.currentTimeMillis() + ".tmp");



        // Читаем и выводим stderr процесса


        // Ждём завершения и печатаем код возврата

    }
}