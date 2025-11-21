package ru.javarush.java.core.level35.task07;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Путь к файлу журнала
        Path logFile = Paths.get("application_activity.log");

        // Текст события, которое нужно добавить
        String event = "Новое событие зафиксировано.";

        // Открываем файл в режиме дозаписи и создаем его при отсутствии

    }
}