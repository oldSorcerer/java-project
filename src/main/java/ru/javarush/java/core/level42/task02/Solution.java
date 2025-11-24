package ru.javarush.java.core.level42.task02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Открываем ZIP-архив "hello.zip" из текущей директории
        // try-with-resources гарантирует корректное закрытие потока

        ZipEntry entry;
        boolean extracted = false;

        // Перебираем все записи внутри архива

        String name = entry.getName();

        // Ищем файл "hello.txt" (игнорируем директории)

        // Создаем выходной файл "output.txt" в текущей директории
        // Поток также будет закрыт автоматически

        byte[] buffer = new byte[8192];
        int read;
        // Копируем данные из текущей записи ZIP в обычный файл




        // Закрываем текущую запись архива и выходим — файл найден и извлечен





        // Переходим к следующей записи



        // Небольшое сообщение, если файл не найден (для наглядности)


    }
}