package ru.javarush.java.core.level22.task04;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Коллекция, где ключ — пользователь (record), значение — строковая роль
        Map<User, String> roles = new HashMap<>();

        // Добавляем нескольких пользователей с уникальными идентификаторами и ролями
        roles.put(new User("Алиса", 1L), "администратор");
        roles.put(new User("Боб", 2L), "модератор");
        roles.put(new User("Ева", 3L), "гость");

        // Создаём новый объект пользователя с теми же данными, что у уже добавленного
        User lookup = new User("Боб", 2L);

        // Ищем его роль: HashMap использует equals/hashCode, которые у record генерируются по компонентам
        String role = roles.get(lookup);

        // Выводим найденную роль на экран
        System.out.println(role);
    }
}