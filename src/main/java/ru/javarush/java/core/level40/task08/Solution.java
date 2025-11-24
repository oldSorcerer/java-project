package ru.javarush.java.core.level40.task08;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Solution {
    public static void main(String[] args) throws IOException {
        // 1) Создаем временную директорию с префиксом 'session_'
        Path sessionDir = Files.createTempDirectory("session_");

        // 2) Создаем два временных файла с разными суффиксами строго внутри созданной директории
        Files.createTempFile(sessionDir, "task_", ".log");
        Files.createTempFile(sessionDir, "result_", ".tmp");

        // 3) Рекурсивно удаляем все файлы и подкаталоги, затем удаляем саму директорию
        deleteRecursively(sessionDir);

        // 4) Финальное сообщение об успешной очистке
        System.out.println("Временная директория и файлы удалены");
    }

    // Рекурсивное удаление каталога:
    // используем FileVisitor, чтобы сначала удалить файлы,
    // а затем — директории (postVisitDirectory вызывается после обхода содержимого)
    private static void deleteRecursively(Path root) throws IOException {


        
    }
}