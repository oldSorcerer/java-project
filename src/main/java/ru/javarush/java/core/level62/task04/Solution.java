package ru.javarush.java.core.level62.task04;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Получаем объект Class для класса Sample


        // getDeclaredMethods() возвращает все методы, объявленные непосредственно в классе, включая private


        // Собираем только имена методов


        // Сортируем для стабильного, предсказуемого вывода


        // Печатаем имена всех объявленных методов класса Sample

    }
}

class Sample {
    // Общеизвестный ритуал: публичный метод без возвращаемого значения
    public void foo() {
        // Пустая реализация: нам важен факт существования метода
    }

    // Скрытый ритуал: приватный метод, возвращает int
    private int bar() {
        return 42; // Любое значение, чтобы метод компилировался
    }
}