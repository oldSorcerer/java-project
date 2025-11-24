package ru.javarush.java.core.level41.task09;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.GZIPOutputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Пути к исходному и целевому файлам в текущей директории
        Path source = Path.of("input.txt");
        Path target = Path.of("input.txt.gz");

        // try-with-resources гарантирует корректное закрытие потоков
        // Закрытие GZIPOutputStream автоматически допишет служебные данные (finish)

            // Копируем данные поблочно из исходного файла в GZIP-поток


    }
}