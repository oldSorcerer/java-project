package ru.javarush.java.core.level45.task04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // 1) Объявляем generics-структуру: список списков строк (товары по дням недели)
        List<List<String>> weeklyShoppingLists = new ArrayList<>();

        // 2) Заполняем "неделю": каждый вложенный список — это покупки на конкретный день
        // Используем ArrayList, т.к. он Serializable (важно для сериализации)
        List<String> monday = new ArrayList<>();
        monday.add("молоко");
        monday.add("хлеб");

        List<String> tuesday = new ArrayList<>();
        tuesday.add("яблоки");
        tuesday.add("сыр");

        List<String> wednesday = new ArrayList<>();
        wednesday.add("курица");
        wednesday.add("рис");

        List<String> thursday = new ArrayList<>();
        thursday.add("кофе");
        thursday.add("печенье");

        List<String> friday = new ArrayList<>();
        friday.add("овсянка");
        friday.add("бананы");

        List<String> saturday = new ArrayList<>();
        saturday.add("сок");
        saturday.add("шоколад");

        List<String> sunday = new ArrayList<>();
        sunday.add("рыба");
        sunday.add("овощи");

        // Добавляем все дни в общий план недели
        weeklyShoppingLists.add(monday);
        weeklyShoppingLists.add(tuesday);
        weeklyShoppingLists.add(wednesday);
        weeklyShoppingLists.add(thursday);
        weeklyShoppingLists.add(friday);
        weeklyShoppingLists.add(saturday);
        weeklyShoppingLists.add(sunday);

        // 3) Сериализуем коллекцию в файл


        // 4) Десериализуем коллекцию обратно из файла


        // 5) Проходим по каждому вложенному списку и выводим его элементы в отдельной строке

    }
}