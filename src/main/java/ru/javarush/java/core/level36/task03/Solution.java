package ru.javarush.java.core.level36.task03;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            Path file = Paths.get("эпическая_сага.txt");

            // Читаем содержимое файла целиком как одну строку в UTF-8


            // Удаляем все переводы строк (\r и \n), чтобы получить непрерывный текст


            // Выводим результат на экран

        } catch (IOException e) {
            // При ошибке чтения или если файл не найден — выводим информацию об исключении
            e.printStackTrace();
        }
    }
}