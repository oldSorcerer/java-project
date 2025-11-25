package ru.javarush.java.core.level45.task09;

import java.io.*;
import java.util.Arrays;
import java.util.zip.GZIPOutputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        DataBlock data = new DataBlock();

        // Цепочка потоков: FileOutputStream -> GZIPOutputStream -> ObjectOutputStream
        // Сериализация через ObjectOutputStream, сжатие на лету через GZIPOutputStream
        try (FileOutputStream fos = new FileOutputStream("data.gz");
             GZIPOutputStream gzos = new GZIPOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(gzos)) {
            oos.writeObject(data);
        }

        // Определяем размер сжатого файла в байтах и выводим на экран
        long size = new File("data.gz").length();
        System.out.println(size);
    }
}