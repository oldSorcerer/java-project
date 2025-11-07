package ru.javarush.java.core.level02.task17;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Считываем одну строку как пароль
        String string = scanner.nextLine();

        // Выводим введенный пароль на экран
        System.out.println(string);
    }
}