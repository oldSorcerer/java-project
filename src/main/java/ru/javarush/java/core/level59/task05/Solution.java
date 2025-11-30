package ru.javarush.java.core.level59.task05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Используем директорию по умолчанию "digital_library"
        Path start =Paths.get("digital_library");

        long count = 0;


        // Печатаем только число — итоговое количество файлов
        System.out.println(count);
    }
}