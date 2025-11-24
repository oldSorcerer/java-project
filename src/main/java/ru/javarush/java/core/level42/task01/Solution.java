package ru.javarush.java.core.level42.task01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Solution {
    public static void main(String[] args) {
        // Имена архива и файла внутри него


        // Текст секретного послания


        // try-with-resources автоматически закроет ZipOutputStream и вложенный FileOutputStream

        // Создаем новую запись (файл) внутри архива с именем hello.txt


        // Записываем содержимое файла в архив (в байтовом виде, кодировка UTF-8)


        // Закрываем текущую запись (обязательный шаг перед закрытием архива)


        // Для учебной задачи достаточно распечатать стек исключения


    }
}