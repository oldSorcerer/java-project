package ru.javarush.java.core.level05.task05;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем сканер для чтения числа с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту обелиска (целое число): ");
        int pyramidHeight = scanner.nextInt();

        // Строим обелиск строка за строкой
        for (int i = 0; i < pyramidHeight; i++) {
            // Количество пробелов слева: уменьшается от (N - 1) до 0
            int spaces = pyramidHeight - i - 1;

            // Количество звездочек: растет по формуле (2 * row - 1)
            int stars = (2 * (i + 1)) - 1;

            // Печатаем пробелы для выравнивания
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // Печатаем звездочки
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            // Переход на новую строку после каждой строки обелиска
            System.out.println();
        }
    }
}