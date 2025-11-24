package ru.javarush.java.core.level40.task06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Корневая директория с исходными файлами
        Path dataDir = Paths.get("data");
        // Корневая директория назначения
        Path archiveDir = Paths.get("archive");

        try {
            // Создаем директорию archive, если ее нет
            Files.createDirectories(archiveDir);
        } catch (IOException e) {
            // Если даже archive не удалось создать — дальше нет смысла продолжать
            System.out.println("Ошибка копирования " + archiveDir + ": " + e.getMessage());
            return;
        }

        // Рекурсивно обходим каталог data

        
    }
}