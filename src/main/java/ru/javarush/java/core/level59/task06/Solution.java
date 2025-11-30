package ru.javarush.java.core.level59.task06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Корневая директория для обхода. По умолчанию — "evidence_vault".
        Path root = Paths.get("evidence_vault");

        // Пороговая дата: 7 дней назад от текущего момента.
        Instant cutoff = Instant.now().minus(7, ChronoUnit.DAYS);

        // Files.walk — рекурсивный обход ФС (включая поддиректории).
        // Превращаем поток в параллельный через parallel() для ускорения.
        try (Stream<Path> walk = Files.walk(root)) {


            // Выводим найденные пути (по одному в строке)

        } catch (IOException e) {
            // В учебной задаче достаточно краткого сообщения
            System.out.println("Не удалось обойти директорию: " + root);
        }
    }

    // Возвращает true, если файл изменён позже указанного момента времени.
    private static boolean wasModifiedAfter(Path path, Instant cutoff) {
        try {
            return Files.getLastModifiedTime(path).toInstant().isAfter(cutoff);
        } catch (IOException e) {
            // Если не удалось получить атрибут — считаем, что файл не подходит
            return false;
        }
    }
}