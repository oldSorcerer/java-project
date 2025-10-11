package ru.javarush.java.core.level12.task16;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HttpClient из стандартной библиотеки Java


        // Готовим GET-запрос на указанный URL


        // Отправляем запрос и сразу получаем тело как массив байт


        // Извлекаем тип содержимого из заголовка Content-Type


        // Определяем размер файла по длине массива байт ответа


        // Сначала выводим информацию о типе и размере


        // Только после вывода сохраняем изображение на диск

    }
}