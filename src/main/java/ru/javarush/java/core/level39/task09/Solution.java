package ru.javarush.java.core.level39.task09;

import java.io.File;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Читаем строку с путем к файлу
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();
        File target = new File(path);

        // Явно проверяем существование для наглядности:
        // если файла нет, все права считаем false.


        // Системные проверки прав доступа (java.io.File):


        // Три строки результата в требуемом формате и порядке

    }
}