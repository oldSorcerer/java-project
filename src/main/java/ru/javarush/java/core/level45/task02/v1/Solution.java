package ru.javarush.java.core.level45.task02.v1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Шаг 1 (старая система):
 * - Создаем объект Book со старой структурой (без publicationYear)
 * - Сериализуем в файл ../books.bin
 *
 * Важно запускать этот файл из папки v1, чтобы books.bin оказался на уровень выше (в /solution).
 */
public class Solution {
    private static final String FILE_NAME = "../books.bin";

    public static void main(String[] args) throws Exception {
        // Создаем "старый" объект книги
        Book warAndPeace = new Book("Война и мир", "Лев Толстой");

        // Сохраняем его в файл (старая структура: только title + author)
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(warAndPeace);
        }

        System.out.println("Сериализован объект Book (старая версия) в файл: " + FILE_NAME);
        System.out.println("Теперь обновите класс Book (папка v2) и запустите там Solution для чтения файла.");
    }
}