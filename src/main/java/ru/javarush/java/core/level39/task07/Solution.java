package ru.javarush.java.core.level39.task07;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Считываем путь к корневой директории с консоли
        Scanner console = new Scanner(System.in);
        String root = console.nextLine();

        Path start = Paths.get(root);

        // Обходим файловую систему с помощью FileVisitor (через SimpleFileVisitor)
        // Files.walkFileTree рекурсивно пройдёт по всем вложенным каталогам

      
    }
}