package ru.javarush.java.core.level41.task10;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Корневая папка "древней библиотеки"


        if (!Files.isDirectory(docsRoot)) {
            // Для простоты — лишь сообщение и выход (полную обработку ошибок не делаем)


        }

        // Имя создаваемого архива в текущей рабочей директории


        // Глоббинг по шаблону glob:**/*.txt — совпадение всех .txt на любой глубине


        // 1) Рекурсивно обходим все файлы внутри "docs" с помощью Files.walk
        // 2) Оставляем только обычные файлы
        // 3) Фильтруем по glob-шаблону, чтобы взять только .txt








        // Создаем архив и добавляем в него найденные файлы

        for (Path file : txtFiles) {
            // Относительный путь внутри "docs" — так сохраняется структура директорий


            // Добавляем запись в архив


            // Переносим содержимое файла прямо в архив (без лишних буферов)


            // Закрываем текущую запись

        }




    }
}