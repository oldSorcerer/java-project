package ru.javarush.java.core.level36.task06;

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Имя бинарного файла с артефактом
        String fileName = "энергетический_артефакт.bin";

        long sum = 0; // Сумма значений всех байтов (long, чтобы не переполнить int при больших файлах)




        // Если файл пустой, сумма останется 0 — это и есть "энергетический потенциал 0"
        System.out.println(sum);
    }
}