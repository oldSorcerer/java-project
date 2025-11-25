package ru.javarush.java.core.level45.task02.v2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Шаг 2 (новая система):
 * - Класс Book обновлён: добавлено поле publicationYear, serialVersionUID не меняли.
 * - Десериализуем "старый" файл ../books.bin, созданный программой из папки v1.
 * - Проверяем, что:
 *     - bookTitle и bookAuthor восстановились из файла,
 *     - publicationYear = 0 (значение по умолчанию, т.к. его не было в старом файле).
 *
 * Важно запускать этот файл из папки v2, чтобы путь к файлу ../books.bin был корректным.
 */
public class Solution {
    private static final String FILE_NAME = "../books.bin";

    public static void main(String[] args) throws Exception {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Book restored = (Book) in.readObject();

            // Выводим значения всех трёх полей
            System.out.println("bookTitle: " + restored.bookTitle);
            System.out.println("bookAuthor: " + restored.bookAuthor);
            System.out.println("publicationYear: " + restored.publicationYear); // Ожидаем 0
        }
    }
}