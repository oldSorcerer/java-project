package ru.javarush.java.core.level28.task10;

public class Solution {
    public static void main(String[] args) {
        // Создаем кэш с порядком по доступу (LRU)
        GameAssetCache cache = new GameAssetCache();

        // Добавляем ассеты
        cache.put(1, "one");
        cache.put(2, "two");

        // "Используем" ассет с ключом 1 — он становится самым недавно использованным
        cache.get(1);

        // Добавляем ассет 3 — это спровоцирует удаление наименее недавно использованного (2)
        cache.put(3, "three");

        // Выводим ключи оставшихся ассетов в порядке от менее к более "свежих"
        for (Integer id : cache.keySet()) {
            System.out.println(id);
        }
    }

}