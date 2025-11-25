package ru.javarush.java.core.level44.task10;

import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        // 1) Создаем большую коллекцию из 10 000 элементов
        int count = 10_000;
        ArrayList<DataItem> data = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            data.add(new DataItem(i)); // Последовательные значения value
        }

        // 2) Сериализация без сжатия в файл data.ser

        // try-with-resources гарантирует корректное закрытие потоков (и flush)


        // 3) Сериализация со сжатием в файл data.gz


        // 4) Сравнение размеров получившихся файлов

    }
}