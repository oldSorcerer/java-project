package ru.javarush.java.core.level12.task18;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HTTP-клиент (основной объект для отправки запросов)


        // Готовим GET-запрос к API МКС


        // Отправляем запрос и получаем ответ.
        // Используем BodyHandlers.discarding(), так как нам нужен только статус, а тело можно не загружать.


        // Извлекаем и выводим числовой HTTP-статус (например, 200)

    }
}