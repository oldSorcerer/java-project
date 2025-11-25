package ru.javarush.java.core.level44.task10;

import java.io.Serializable;

/**
 * Простой класс-объект данных.
 * Содержит одно поле int value и реализует Serializable,
 * чтобы его экземпляры можно было сериализовать.
 */
public class DataItem implements Serializable {
    private static final long serialVersionUID = 1L; // Явная версия для стабильной сериализации

    int value; // Единственное поле с данными

    public DataItem(int value) {
        this.value = value;
    }
}