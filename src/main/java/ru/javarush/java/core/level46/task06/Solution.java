package ru.javarush.java.core.level46.task06;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем коллекцию пользователей и добавляем разные профили
        List<SocialNetworkUser> users = new ArrayList<>();
        users.add(new SocialNetworkUser("Анна", 28, true));
        users.add(new SocialNetworkUser("Борис", 19, false));

        // Настраиваем Gson:
        // - excludeFieldsWithoutExposeAnnotation: исключаем поля без @Expose
        // - setPrettyPrinting: красивый формат JSON с отступами


        // Сериализуем список в JSON и выводим на экран

    }
}