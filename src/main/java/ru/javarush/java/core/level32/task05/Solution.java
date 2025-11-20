package ru.javarush.java.core.level32.task05;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Два исходных множества подозреваемых из разных источников
        Set<String> suspectsFromSourceA = Set.of("Анна", "Борис", "Виктор", "Дмитрий", "Елена");
        Set<String> suspectsFromSourceB = Set.of("Виктор", "Елена", "Жанна", "Игорь", "Павел");

        // Симметрическая разность множеств через Stream API:
        // (A \ B) ∪ (B \ A) — т.е. оставляем только тех, кто встречается ровно в одном из наборов


        // Вывод результата
        System.out.println(uniqueLeads);
    }
}