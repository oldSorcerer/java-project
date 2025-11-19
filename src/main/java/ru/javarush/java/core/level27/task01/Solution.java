package ru.javarush.java.core.level27.task01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную палитры через интерфейс List,
        // а в качестве реализации используем LinkedList
        List<String> list = new LinkedList<>();

        // Добавляем три цвета в палитру
        list.add("красный");
        list.add("зелёный");
        list.add("синий");

        // Получаем второй элемент (индекс 1) методом get и выводим его
        System.out.println(list.get(1));
    }
}