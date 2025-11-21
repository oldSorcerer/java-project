package ru.javarush.java.core.level37.task08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Путь к тестовому файлу
        Path testFilePath = Paths.get("test_encoding.txt");

        // Текст, который сохраняем в UTF-8
        String multilingualTestMessage = "Тест: Привет, мир! €";

        // 1) Создаем/перезаписываем файл и записываем строку в кодировке UTF-8


        // 2) Читаем файл трижды через Files.newBufferedReader с разными "переводчиками" (кодировками)

    }

    // Построчное чтение через Files.newBufferedReader с заданной кодировкой
    private static String readAll(Path path, Charset charset) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
            StringBuilder sb = new StringBuilder();
            String line;
            boolean first = true;
            while ((line = reader.readLine()) != null) {
                // Сохраняем переводы строк, если бы их было несколько
                if (!first) sb.append(System.lineSeparator());
                sb.append(line);
                first = false;
            }
            return sb.toString();
        }
    }
}