package ru.javarush.java.core.level26.task01;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список (реализация ArrayList) для хранения названий фруктов
        List<String> list = new ArrayList<>();

        // Добавляем фрукты в заданном порядке
        list.add("Яблоко");
        list.add("Банан");
        list.add("Груша");

        // Выводим весь список: метод toString() у коллекции показывает все элементы
        list.forEach(System.out::println);
    }
}