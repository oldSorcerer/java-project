package ru.javarush.java.core.level27.task02;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // List хранит все предметы, включая повторы
        List<Integer> list = new ArrayList<>();

        // Set хранит только уникальные предметы (повторы игнорируются)
        Set<Integer> set = new HashSet<>();

        // Добавляем идентификаторы 3, 7, 3, 9 в обе коллекции
        List<Integer> ids = Arrays.asList(3, 7, 3, 9);
        list.addAll(ids);
        set.addAll(ids);

        // Выводим количество: сначала общее (List), затем уникальное (Set)
        System.out.println(list.size());
        System.out.println(set.size());

    }
}