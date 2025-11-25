package ru.javarush.java.core.level46.task03;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// Главный класс для демонстрации сериализации PortalUser в JSON
public class Solution {
    public static void main(String[] args) throws JsonProcessingException {
        // Создаем экземпляр PortalUser с заданными параметрами
        PortalUser user = new PortalUser();
        user.setUsername("admin");    // логин пользователя
        user.setPassword("12345");    // пароль пользователя (не попадет в JSON)
        user.setAge(20);              // возраст пользователя

        // Создаем ObjectMapper для работы с JSON
        ObjectMapper mapper = new ObjectMapper();
        // Сериализуем объект пользователя в JSON-строку
        String json = mapper.writeValueAsString(user);
        // Выводим результат сериализации на консоль
        System.out.println(json);
        // Ожидаемый вывод: {"login":"admin","age":20}
    }
}