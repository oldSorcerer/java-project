package ru.javarush.java.core.level39.task05;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Папка с отчётами
        Path dataDir = Paths.get("data");

        // Фильтр для DirectoryStream:
        // 1) пропускаем только обычные файлы (не директории);
        // 2) имя файла должно начинаться с 'A' и заканчиваться на ".csv".


        // Перебираем содержимое папки "data" через DirectoryStream с нашим фильтром

    }
}