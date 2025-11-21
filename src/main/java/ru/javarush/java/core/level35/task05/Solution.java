package ru.javarush.java.core.level35.task05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Имя файла в каталоге запуска программы (относительный путь)
        String fileName = "encrypted_message.bin";

        // 1) Создаем файл и записываем в него любое содержимое


        // 2) Читаем файл побайтно и считаем каждый байт


        // 3) Выводим результат в требуемом формате
        System.out.println("Размер документа: " + count + " байт");
    }
}