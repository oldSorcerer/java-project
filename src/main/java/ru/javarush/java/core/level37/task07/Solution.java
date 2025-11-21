package ru.javarush.java.core.level37.task07;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) {
        // Путь к "древнему свитку" — UTF-8 файл с не-ASCII символами
        Path ancientScrollPath = Paths.get("ancient_scroll.txt");

        // "Неверная линза": намеренно указываем кодировку ISO-8859-1
        Charset decryptionCharset = StandardCharsets.ISO_8859_1;

        // Сюда сохраним результат чтения при расшифровке неверной кодировкой
        String decodedContent = "";

        // Поля для информации об ошибке, если она случится
        String exceptionType = "";
        String errorMessage = "";

        // Пытаемся прочитать UTF-8 файл как ISO-8859-1 через Files.newBufferedReader
        try ( ... ) {

        } catch (IOException e) {
            // Если при чтении что-то пошло не так — сообщаем об этом

        }
    }
}