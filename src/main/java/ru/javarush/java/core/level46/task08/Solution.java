package ru.javarush.java.core.level46.task08;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считываем весь JSON из stdin (внешний источник) в одну строку
        Scanner console = new Scanner(System.in);
        StringBuilder rawJson = new StringBuilder();
        while (console.hasNextLine()) {
            rawJson.append(console.nextLine());
        }
        String json = rawJson.toString();

        // Создаем ObjectMapper — "сердце" Jackson


        // Из-за стирания типов (type erasure) передаем явный тип результата через TypeReference
        // Десериализуем JSON-массив в List<Map<String, Object>>


        // Для каждого элемента извлекаем значение по ключу "city" и печатаем с новой строки

    }
}