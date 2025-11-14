package ru.javarush.java.core.level12.task20;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HttpClient и формируем GET-запрос
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create("http://api.open-notify.org/iss-now.json");
        

        // Отправляем запрос и получаем тело ответа целиком как строку


        // Вручную находим в строке объект "iss_position"


        // Находим границы объекта iss_position: от '{' до соответствующей '}'


        // Внутри iss_position извлекаем значения полей "latitude" и "longitude"


        // Форматированный вывод координат
        System.out.println("Текущие координаты МКС: широта = " + latitude + ", долгота = " + longitude);
    }

    // Вспомогательный метод: извлекает строковое значение поля по его имени внутри JSON-фрагмента.
    // Логика простая: находим "ключ", затем двоеточие, затем первую и вторую кавычки значения.
    private static String extractQuotedValue(String jsonFragment, String fieldName) {
        int keyPos = jsonFragment.indexOf("\"" + fieldName + "\""); // позиция ключа "fieldName"
        int colonPos = jsonFragment.indexOf(':', keyPos);           // двоеточие после ключа
        int firstQuote = jsonFragment.indexOf('"', colonPos + 1);   // открывающая кавычка значения
        int secondQuote = jsonFragment.indexOf('"', firstQuote + 1); // закрывающая кавычка значения
        return jsonFragment.substring(firstQuote + 1, secondQuote);  // само значение между кавычками
    }
}