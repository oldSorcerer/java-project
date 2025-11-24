package ru.javarush.java.core.level39.task08;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Считываем путь до директории, которую нужно удалить целиком
        Scanner console = new Scanner(System.in);
        System.out.println("Введите путь к директории, которую нужно удалить полностью:");
        String input = console.nextLine().trim();

        Path root = Paths.get(input);

        // Небольшая проверка входных данных — чтобы программа вежливо завершалась
        if (!Files.exists(root)) {
            System.out.println("Указанный путь не существует: " + root.toAbsolutePath());
            return;
        }
        if (!Files.isDirectory(root)) {
            System.out.println("Это не директория: " + root.toAbsolutePath());
            return;
        }

        // Обход дерева с помощью SimpleFileVisitor:
        // - visitFile: удаляем каждый файл
        // - postVisitDirectory: после удаления всех вложенных элементов удаляем саму папку

        
    }
}