package ru.javarush.java.core.level26.task04;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список (ArrayList) для названий фильмов
        List<String> list = new ArrayList<>();

        // Добавляем фильмы в список
        list.add("Титаник");
        list.add("Матрица");
        list.add("Интерстеллар");

        // по ошибке добавили снова
        list.add("Матрица");

        // Ищем первое вхождение "Матрица"
        int index = list.indexOf("Матрица");
        System.out.println("Первое вхождение фильма 'Матрица' находится на позиции: " + index);

        // Проверяем наличие "Аватар" в списке
        // contains возвращает true/false
        boolean contains = list.contains("Аватар");
        System.out.println("Содержится ли фильм \"Аватар\" в списке? " + contains);

        // Очищаем список
        list.clear();;

        // Выводим содержимое списка после очистки — должен быть пустым: []
        System.out.println("Список после очистки: " + list);
    }
}