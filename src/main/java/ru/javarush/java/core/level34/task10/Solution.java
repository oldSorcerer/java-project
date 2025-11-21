package ru.javarush.java.core.level34.task10;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class Solution {
    public static void main(String[] args) {
        // Создаем изменяемую коллекцию, которая поддерживает интерфейс SequencedCollection (Java 21+)
        SequencedCollection<String> algorithmSteps = new ArrayList<>();
        algorithmSteps.add("Шаг A");
        algorithmSteps.add("Шаг B");
        algorithmSteps.add("Шаг C");

        // Получаем обратное представление. Важно: это "живое" представление, а не копия.


        // Добавляем новый элемент через обратное представление.
        // Добавление в конец reversed-представления соответствует добавлению в начало исходной коллекции.


        // Демонстрируем, что изменения через reversedStepsView отразились в исходной коллекции
        System.out.println("Исходная последовательность algorithmSteps:");
        printInline(algorithmSteps);

        System.out.println("\nОбратное представление reversedStepsView:");
        printInline(reversedStepsView);
    }

    // Утилитный метод для компактного вывода содержимого коллекции в порядке итерации
    private static void printInline(Iterable<String> iterable) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;
        for (String s : iterable) {
            if (!first) sb.append(", ");
            sb.append(s);
            first = false;
        }
        sb.append("]");
        System.out.println(sb);
    }
}