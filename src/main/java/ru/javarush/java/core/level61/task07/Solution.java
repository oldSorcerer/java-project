package ru.javarush.java.core.level61.task07;

import java.io.PrintWriter;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Выбираем команду для эхо: Windows → "more", Linux/Mac → "cat"
        boolean isWindows = System.getProperty("os.name").toLowerCase().contains("win");
        var process = new ProcessBuilder(isWindows ? "more" : "cat")
                .redirectErrorStream(true)
                .start();

        // Пишем строку во входной поток процесса и закрываем stdin (EOF)


        // Читаем весь вывод процесса


        // Ждем 

    }
}