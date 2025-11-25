package ru.javarush.java.core.level46.task07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Исходная JSON-строка с данными персонажа
        String json = "{\"id\":100,\"name\":\"Bob\",\"active\":false}";

        // ObjectMapper — основной класс Jackson для работы с JSON


        // Десериализация JSON в универсальную структуру Map<String, Object>
        // Используем TypeReference, чтобы сохранить дженерики при чтении


        // Извлекаем значение по ключу "name"


        // Выводим имя на экран
        System.out.println(name);
    }
}