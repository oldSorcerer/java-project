package ru.javarush.java.core.level35.task06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        Path logFile = Path.of("system_log.txt");

        // Подготавливаем список выдуманных событий для записи в файл
        List<String> events = List.of(
                "Сервер запущен",
                "Пользователь вошел: admin",
                "Ошибка базы данных",
                "Резервное копирование завершено",
                "Служба остановлена"
        );

        // Записываем события в файл построчно.


        // Читаем файл построчно и выводим каждую строку на экран.

    }
}