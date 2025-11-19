package ru.javarush.java.core.level27.task08;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        // Основной складской реестр: упорядоченное множество с навигационными методами
        NavigableSet<Integer> set = new TreeSet<>();

        // Добавляем идентификаторы товаров
        set.addAll(Arrays.asList(10, 20, 30, 40, 50));

        // Формируем "вид" на часть реестра: от 20 (включительно) до 50 (исключительно)
        // subSet в NavigableSet возвращает представление (view), связанное с исходным множеством
        NavigableSet<Integer> view = set.subSet(20, true, 50, false);

        // Удаляем поврежденный товар 30 из временного списка — изменение отразится и в реестре
        view.remove(30);

        // Сначала выводим временный список отгрузки, затем основной реестр
        System.out.println(view);
        System.out.println(set);

    }
}