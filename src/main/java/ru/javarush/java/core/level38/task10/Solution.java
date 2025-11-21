package ru.javarush.java.core.level38.task10;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Создаем временный файл в системной temp-директории


        // Пишем секретное сообщение в файл.
        // try-with-resources гарантирует закрытие BufferedWriter даже при ошибках.


        // "Читаем" содержимое файла (симулируем прочтение) — выводить на экран не будем
        // чтобы не оставлять следов.


        // Немедленно удаляем временный файл после прочтения


        // Подтверждаем успешное удаление

    }
}