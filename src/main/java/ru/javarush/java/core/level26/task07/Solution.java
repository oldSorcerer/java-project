package ru.javarush.java.core.level26.task07;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        // TreeSet автоматически сортирует строки по алфавиту и не допускает дубликатов
        Set<String> set = new TreeSet<>();

        // Добавляем первых трёх зарегистрировавшихся (порядок добавления произвольный)
        set.add("Борис");
        set.add("Алексей");
        set.add("Виктор");

        // Выводим список участников в алфавитном порядке
        set.forEach(System.out::println);

    }
}