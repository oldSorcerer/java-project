package ru.javarush.java.core.level27.task07;

import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        // Создаем NavigableMap, чтобы быстро находить порог по баллам
        NavigableMap<Integer, String> map = new TreeMap<>();

        // Заполняем карту: ключ — минимальные баллы, значение — название уровня
        map.put(1, "бронзовый");
        map.put(3, "серебряный");
        map.put(5, "золотой");
        map.put(7, "платиновый");

        // Считываем количество баллов клиента
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        // Находим наибольший ключ, не превышающий количество баллов
        Integer key = map.floorKey(count);

        // Получаем и выводим название уровня (если порога нет — выводим сообщение)
        System.out.println(key != null ? map.get(key) : "нет уровня");
    }
}