package ru.javarush.java.core.level36.task04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // Имена входных файлов с зашифрованными сообщениями
        String file1 = "досье_А.txt";
        String file2 = "досье_Б.txt";

        // Множество для хранения уникальных строк из первого файла (для быстрого поиска)
        Set<String> secrets1 = new LinkedHashSet<>();
        // Множество для хранения найденных общих секретов (сохранит порядок первого вхождения)
        Set<String> commonSecrets = new LinkedHashSet<>();

        // Читаем первое досье построчно и сохраняем каждую строку в secrets1


        // Читаем второе досье построчно и проверяем, встречалась ли строка в первом досье


        // Выводим только те строки, которые присутствуют в обоих досье
        for (String secret : commonSecrets) {
            System.out.println(secret);
        }
    }
}