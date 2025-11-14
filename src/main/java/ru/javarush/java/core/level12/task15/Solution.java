package ru.javarush.java.core.level12.task15;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Адрес изображения
        String url = "https://httpbin.org/image/webp";

        // Создаем клиент HTTP (стандартная конфигурация)


        // Готовим GET-запрос к нужному URL


        // Отправляем запрос и получаем ответ как массив байт (тело — бинарные данные картинки)


        int status = response.statusCode(); // Проверяем HTTP-статус
        if (status == 200) {
            // Сохраняем файл только при успешном ответе 200
            Path target = Path.of("image03.webp");
            Files.write(target, response.body()); // Записываем байты на диск
        } else {
            // Если сервер вернул неуспешный код — выводим сообщение об ошибке
            System.out.println("Ошибка загрузки: код ответа " + status);
        }
    }
}