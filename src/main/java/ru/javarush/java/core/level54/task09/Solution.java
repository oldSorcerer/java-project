package ru.javarush.java.core.level54.task09;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // 1) Исходная коллекция из 100 "камней": числа 1..100
        List<Integer> enchantedStones = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            enchantedStones.add(i);
        }

        // 2) "Сумка для реплик" — обычный ArrayList (НЕ потокобезопасный).


        // 3) Параллельно удваиваем элементы и добавляем их в общую коллекцию.


        // 4) Вывод результата: из-за отсутствия потокобезопасности размер/содержимое может "плавать"
        System.out.println("Ожидаемый размер сумки: 100");
        System.out.println("Фактический размер сумки: " + replicaBag.size());
        System.out.println("Содержимое сумки: " + replicaBag);
    }
}