package ru.javarush.java.core.level42.task09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Создаем список ингредиентов и заполняем его
        List<String> potionIngredients = new ArrayList<>();
        potionIngredients.add("яблоко");
        potionIngredients.add("банан");
        potionIngredients.add("киви");

        // Сериализация списка в файл fruits.ser
        // try-with-resources автоматически закроет потоки после использования


        // Десериализация списка из файла fruits.ser


        // Вывод элементов десериализованного списка по одному в каждой строке

    }
}