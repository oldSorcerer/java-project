package ru.javarush.java.core.level37.task02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Объявляем требуемые переменные
        String magicInscription = "Привет, Java!";
        String fileName = "output.txt";


        // Запись строки в файл:
        // OutputStreamWriter оборачивает FileOutputStream, кодировка — UTF-8


        // Чтение строки из файла:
        // InputStreamReader оборачивает FileInputStream, кодировка — UTF-8


        // Вывод восстановленного текста на экран

    }
}