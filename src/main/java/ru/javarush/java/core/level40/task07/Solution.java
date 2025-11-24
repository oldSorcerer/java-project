package ru.javarush.java.core.level40.task07;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) {
        try {
            // Создаем временный файл: Files самостоятельно добавит уникальную часть между префиксом и суффиксом


            // Записываем строку "temp data" с безопасным закрытием ресурса (try-with-resources)


            // Удаляем временный файл безопасным методом: не бросит исключение, если файл уже отсутствует


            // Дополнительно проверяем, что файла действительно больше нет, и подтверждаем удаление

        } catch (IOException e) {
            // В учебной задаче достаточно кратко сообщить об ошибке
            System.err.println("Ошибка при работе с временным файлом: " + e.getMessage());
        }
    }
}