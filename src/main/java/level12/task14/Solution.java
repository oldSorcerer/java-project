package ru.javarush.java.core.level12.task14;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Создаем объект URL для указания адреса изображения
        URL url = new URL("https://httpbin.org/image/jpeg");

        // Открываем InputStream из URL (открытие соединения и получение данных)


        // Создаем OutputStream для записи данных в файл image02.jpg


        // Метод transferTo напрямую передаст все байты из input в output

    }
}