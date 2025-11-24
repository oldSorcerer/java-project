package ru.javarush.java.core.level40.task05;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Path data = Paths.get("data");
        Path backup = Paths.get("backup");

        // Проверяем, что директория 'data' существует
        if (Files.notExists(data) || !Files.isDirectory(data)) {
            System.out.println("Директория 'data' не найдена.");
            return;
        }

        try {
            // Создаем 'backup', если ее нет
            Files.createDirectories(backup);
        } catch (IOException e) {
            // Если не смогли создать папку назначения — дальше нет смысла продолжать
            System.out.println("Ошибка копирования backup: " + e.getMessage());
            return;
        }

        // Берем только непосредственные элементы внутри 'data' (без рекурсивного обхода для выбора)


        
    }

    // Рекурсивная копия каталога с помощью обхода дерева файлов
    private static void copyDirectory(Path sourceDir, Path targetDir) throws IOException {
        Files.walkFileTree(sourceDir, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                // Создаем соответствующую директорию в целевом месте (сохраняем относительный путь)
                Path relative = sourceDir.relativize(dir);
                Path dest = targetDir.resolve(relative);
                Files.createDirectories(dest);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                // Копируем файл, сохраняя структуру и атрибуты
                Path relative = sourceDir.relativize(file);
                Path dest = targetDir.resolve(relative);
                Files.copy(file, dest,
                        StandardCopyOption.REPLACE_EXISTING,
                        StandardCopyOption.COPY_ATTRIBUTES);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}