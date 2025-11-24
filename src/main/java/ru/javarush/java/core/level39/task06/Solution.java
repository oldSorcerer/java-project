package ru.javarush.java.core.level39.task06;

import java.io.IOException;
import java.nio.file.*;

public class Solution {
    // PathMatcher с регулярным выражением и флагом (?i) — игнорируем регистр расширения
    // Сопоставляем имена, оканчивающиеся на .png или .jpg (любой регистр)
    private static final PathMatcher matcher =
            FileSystems.getDefault().getPathMatcher("regex:(?i).*\\.(png|jpg)");

    public static void main(String[] args) throws IOException {
        // Точка старта — папка "images" рядом с программой
        Path start = Paths.get("images");

        // Если папки нет или это не директория — нечего обходить
        if (!Files.isDirectory(start)) {
            return; // по условию выводим только найденные пути
        }

        // Рекурсивно обходим всю структуру папок
        scan(start);
    }

    // Рекурсивный обход каталога:
    // - используем DirectoryStream с фильтром, чтобы проходить только по директориям
    //   и тем файлам, что подходят по расширению;
    // - для директорий — уходим глубже (рекурсия),
    // - для подходящих файлов — печатаем абсолютный путь.
    private static void scan(Path dir) throws IOException {
        // Фильтр: пропускаем директории и файлы .png/.jpg (без учёта регистра)


    }
}