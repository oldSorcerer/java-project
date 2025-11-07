package ru.javarush.java.core.level02.task19;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Считываем цены двух товаров как целые числа
        int price1 = scanner.nextInt();
        int price2 = scanner.nextInt();

        // Складываем и выводим сумму
        System.out.println(price1 + price2);

    }
}