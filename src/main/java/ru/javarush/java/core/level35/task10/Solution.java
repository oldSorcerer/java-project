package ru.javarush.java.core.level35.task10;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Путь к директории "game_assets" в текущем рабочем каталоге
        Path assetsDir = Paths.get("game_assets");

        // Создаём директорию, если её ещё нет
        Files.createDirectories(assetsDir);

        // Пути к файлам-заглушкам внутри директории
        Path characterModel = assetsDir.resolve("character_model.obj");
        Path environmentTexture = assetsDir.resolve("environment_texture.png");

        // Создаём пустые файлы, если они ещё не существуют


        // Перечисляем содержимое директории: имена файлов/папок построчно
        // Используем DirectoryStream, чтобы пройтись по элементам папки без лишних зависимостей

    }
}