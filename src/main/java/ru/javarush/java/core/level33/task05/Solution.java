package ru.javarush.java.core.level33.task05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Шаг 1. Создаем обычный изменяемый список ArrayList и добавляем три редкие книги
        List<String> rareBooks = new ArrayList<>();
        rareBooks.add("Кодекс Ветров");
        rareBooks.add("Гримуар Света");
        rareBooks.add("Хроники Звёздной Пыли");

        // Шаг 2. Создаем неизменяемую обёртку поверх исходного списка.
        // Важно: unmodifiableList не копирует элементы, а создает "вид" (view) над тем же ArrayList,
        // поэтому сохраняется ссылочная связь с исходным списком.


        // Шаг 3. Выводим содержимое защищённого каталога
        System.out.println("Содержимое защищённого каталога:");
        for (String book : protectedCatalog) {
            System.out.println(book);
        }
    }
}