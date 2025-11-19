package ru.javarush.java.core.level28.task06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаем и заполняем HashMap результатами участников
        HashMap<String, Integer> results = new HashMap<>();
        results.put("A", 1);
        results.put("B", 2);
        results.put("C", 3);
        results.put("D", 4);

        // Получаем итератор по набору записей (entrySet)


        // Идем по каждой паре "участник-балл"


            // Если балл четный — безопасно удаляем через итератор



        // Выводим очищенную карту на экран
        System.out.println(results);
    }
}