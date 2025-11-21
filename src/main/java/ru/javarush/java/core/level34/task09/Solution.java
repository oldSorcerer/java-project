package ru.javarush.java.core.level34.task09;

import java.util.ArrayDeque;
import java.util.SequencedCollection;

public class Solution {
    public static void main(String[] args) {
        // Создаем пустую SequencedCollection<String>.
        // ArrayDeque реализует Deque, а Deque в Java 21+ расширяет SequencedCollection.
        SequencedCollection<String> taskQueue = new ArrayDeque<>();

        // Перед обращением к элементам всегда проверяем, пуста ли коллекция.

    }
}