package ru.javarush.java.core.level61.task03;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Solution {
    public static void main(String[] args) throws Exception {
        String message = "Input from Java";

        // Определяем команду: "more" для Windows, "cat" для Unix
        String os = System.getProperty("os.name").toLowerCase();
        ProcessBuilder pb = os.contains("win")
                ? new ProcessBuilder("cmd", "/c", "more")
                : new ProcessBuilder("cat");

        // объединяем stdout и stderr


        // Отправляем строку во входной поток процесса и сразу закрываем


        // Читаем и печатаем весь вывод процесса напрямую в stdout


        // дожидаемся завершения
    }
}