package ru.javarush.java.core.level64.task10;

import java.util.HashMap;

public class CacheDemo {
    // "Музей памяти": обычный HashMap хранит сильные ссылки на все свои элементы
    public final HashMap<Object, Object> cache = new HashMap<>();

    public static void main(String[] args) {


        // Добавляем 1000 записей в кэш.
        // И ключ, и значение — новые объекты, на которые нет других ссылок вне HashMap.

        // Выводим размер кэша после заполнения


        // Просим сборщик мусора убрать то, что можно


        // Размер не уменьшается: HashMap держит сильные ссылки,
        // поэтому его элементы не будут собраны GC

    }
}