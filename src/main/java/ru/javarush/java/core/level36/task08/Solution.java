package ru.javarush.java.core.level36.task08;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Исходный инвентарь по типам артефактов
        int[] stockLevels = {10, 20, 30, 40, 50};

        // Имя бинарного файла журнала
        String fileName = "инвентарный_журнал.bin";

        // Записываем данные в бинарный файл с помощью DataOutputStream
        // Сначала записываем количество типов (длину массива), затем все элементы по порядку


        // Читаем данные обратно из файла с помощью DataInputStream
        int[] loaded;


        // Выводим прочитанные уровни запасов, разделяя их пробелами
        for (int i = 0; i < loaded.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(loaded[i]);
        }
        System.out.println();
    }
}