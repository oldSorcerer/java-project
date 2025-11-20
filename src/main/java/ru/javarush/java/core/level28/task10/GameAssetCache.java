package ru.javarush.java.core.level28.task10;

import java.util.LinkedHashMap;
import java.util.Map;

// Класс кэша, реализующий стратегию LRU через LinkedHashMap
// accessOrder=true — порядок итерации по мере использования (доступа), а не вставки
class GameAssetCache extends LinkedHashMap<Integer, String> {
    private static final int MAX_CAPACITY = 2;

    public GameAssetCache() {
        // Третий параметр true включает порядок по доступу (LRU)

    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        // Удаляем самый "старый" элемент, если размер превысил вместимость


    }
}