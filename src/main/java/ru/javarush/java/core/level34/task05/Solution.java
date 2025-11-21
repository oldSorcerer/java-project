package ru.javarush.java.core.level34.task05;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // 1) Создаем изменяемое множество строк
        Set<String> keywords = new HashSet<>();

        // 2) Добавляем три уникальных слова
        keywords.add("spam");
        keywords.add("ads");
        keywords.add("ban");

        // 3) Оборачиваем множество в защитную оболочку (нельзя менять через эту ссылку)


        // 4) Пытаемся удалить слово через оболочку и перехватываем исключение

    }
}