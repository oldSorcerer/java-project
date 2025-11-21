package ru.javarush.java.core.level38.task09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Создаем временный файл в системной директории по умолчанию (безопасное место)
        // Явно задаем префикс "temp_" и суффикс ".tmp"


        // Помечаем файл на удаление при завершении работы JVM
        // (это подчеркивает "мимолетность" записки)


        // Выводим абсолютный путь к созданному временному файлу

    }
}