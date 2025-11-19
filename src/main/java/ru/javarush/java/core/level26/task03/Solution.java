package ru.javarush.java.core.level26.task03;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Используем интерфейс List для хранения названий предметов
        List<String> list = new ArrayList<>();

        // Добавляем три основных предмета
        list.add("Математика");
        list.add("Физика");
        list.add("Информатика");

        // Вставляем "Английский" на первую позицию списка
        list.add(0, "Английский");

        // Удаляем предмет "Физика" из расписания
        list.remove("Физика");

        // Выводим итоговое расписание: каждый предмет с новой строки
        list.forEach(System.out::println);
    }
}