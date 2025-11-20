package ru.javarush.java.core.level33.task09;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

public class Solution {
    public static void main(String[] args) {
        // Исходный массив "свитков" с названиями языков
        String[] languages = {"Java", "Python", "C++", "Kotlin"};

        // Создаем наш кастомный Spliterator для всего диапазона массива
        Spliterator<String> spliterator = new ArrayStringSpliterator(languages, 0, languages.length);

        // Создаем параллельный стрим на базе нашего Spliterator и выводим элементы
        // Порядок не гарантируется, но каждый элемент будет выведен ровно один раз
        StreamSupport.stream(spliterator, true)
                .forEach(System.out::println);
    }
}