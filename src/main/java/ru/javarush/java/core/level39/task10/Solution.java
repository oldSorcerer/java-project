package ru.javarush.java.core.level39.task10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Считываем путь к файлу с клавиатуры
        Scanner console = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        String input = console.nextLine().trim();

        Path path = Paths.get(input);

        try {
            // Читаем текущее значение времени модификации для наглядности и проверки


            // Устанавливаем текущее системное время как время последней модификации
            // (FileTime относится к пакету java.nio.file.attribute)


            // Считываем значение после обновления напрямую из файловой системы


            // Простая проверка успешности: значение после операции отличается от исходного
            // (на некоторых ФС точность метки времени может быть грубее миллисекунд)


            // Выводим новое (актуальное) значение. FileTime печатает ISO-8601 в UTC.

        } catch (IOException e) {
            // Для учебной задачи ограничимся коротким сообщением
            System.out.println("Ошибка при обновлении метаданных: " + e.getMessage());
        }
    }
}