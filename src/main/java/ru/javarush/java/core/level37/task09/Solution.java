package ru.javarush.java.core.level37.task09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Пути к файлам: исходный (Windows-1251) и целевой (UTF-8)
        Path sourceFilePath = Path.of("input-1251.txt");
        Path targetFilePath = Path.of("output-utf8.txt");

        // Явно указываем кодировки для чтения и записи


        // try-with-resources гарантирует корректное закрытие ресурсов

    }
}