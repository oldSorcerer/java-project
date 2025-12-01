package ru.javarush.java.core.level64.task06;

import java.util.WeakHashMap;

class SimpleCache {
    // Ключи в WeakHashMap хранятся слабыми ссылками:
    // когда на ключ больше нет сильных ссылок, запись может быть удалена GC автоматически.
    final WeakHashMap<String, String> cache = new WeakHashMap<>();

    public void put(String key, String value) {
        cache.put(key, value);
    }

    public String get(String key) {
        return cache.get(key);
    }
}

public class Solution {
    public static void main(String[] args) {
        SimpleCache cache = new SimpleCache();

        // Важно: используем новый объект строки, а не литерал.
        // Литералы интернируются в пуле строк и могут держать сильную ссылку,
        // из-за чего запись не будет удалена из WeakHashMap.


        // Добавляем пару в кэш


        // Сразу проверяем, что значение доступно


        // Удаляем сильную ссылку на ключ


        // Просим сборщик мусора освободить ненужные объекты


        // Пытаемся получить значение снова.
        // Если ключ был собран GC, результат будет null.

    }
}