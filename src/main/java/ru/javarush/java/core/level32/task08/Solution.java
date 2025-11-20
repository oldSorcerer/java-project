package ru.javarush.java.core.level32.task08;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Подготовленный список имён
        List<String> potentialNames = Arrays.asList("Ира", "Олег", "Максим", "Таня", "Сергей");

        Random random = new Random();

        // Генерируем бесконечный поток профилей с помощью Stream.generate
        // В каждой генерации случайно выбираем имя из списка и возраст от 18 до 22


        // Выводим список профилей на экран
        System.out.println(demoUserProfiles);
    }
}