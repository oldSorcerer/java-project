package ru.javarush.java.core.level41.task04;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Пути к исходному и целевому файлам (в текущей папке проекта)
        Path source = Path.of("source.txt");
        Path target = Path.of("target.txt");

        // Открываем каналы:
        // - исходный файл только для чтения
        // - целевой файл для записи, создаём при отсутствии и очищаем при наличии


            // Копируем данные супербыстрым способом: FileChannel.transferTo
            // Используем цикл на случай, если передастся не весь объём за один вызов



    }
}