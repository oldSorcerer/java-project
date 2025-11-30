package ru.javarush.java.core.level59.task03;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Solution {

    public static void main(String[] args) {
        // Путь к корневой папке: берём из аргумента или используем "ancient_archive" по умолчанию
        String rootPath = args.length > 0 ? args[0] : "ancient_archive";
        File root = new File(rootPath);

        if (!root.exists() || !root.isDirectory()) {
            System.out.println("Директория не найдена или не является папкой: " + root.getAbsolutePath());
            System.out.println("Укажите путь к каталогу аргументом, например:");
            System.out.println("java Solution /path/to/ancient_archive");
            return;
        }

        // Создаём пул ForkJoin и запускаем задачу подсчёта размера
        ForkJoinPool pool = new ForkJoinPool();
        DirectorySizeTask task = new DirectorySizeTask(root);

        long totalSize = pool.invoke(task); // invoke блокирующе дождётся результата

        // Выводим общий размер архива в байтах
        System.out.println("Общий размер архива: " + totalSize + " байт");

        pool.shutdown();
    }
}