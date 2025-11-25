package ru.javarush.java.core.level46.task04;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;
import java.util.Date;

// Главный класс решения задачи
public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем SimpleDateFormat с шаблоном "yyyy-MM-dd" для парсинга строковой даты
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2024-06-10"); // Преобразуем строку в объект java.util.Date

        // Формируем объект UniversityEvent с нужным названием и датой
        UniversityEvent event = new UniversityEvent();
        event.setEventTitle("Выпускной экзамен");
        event.setEventDate(date);

        // Создаем Jackson ObjectMapper и сериализуем объект в JSON-строку
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(event);

        // Выводим результат на экран
        System.out.println(json);
    }
}