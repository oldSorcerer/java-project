package ru.javarush.java.core.level37.task04;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Заданная фраза с разноязычными символами и эмодзи
        String multilingualPhrase = "AБВΓéü😀";

        // Имена файлов под разные кодировки
        String utf8FileName = "test_utf8.txt";
        String utf16FileName = "test_utf16.txt";
        String latin1FileName = "test_latin1.txt";

        // 1) Записываем строку в UTF-8 и измеряем размер файла


        // 2) Записываем строку в UTF-16 (c BOM) и измеряем размер файла


        // 3) Пытаемся записать строку в ISO-8859-1
        // По умолчанию Java заменяет неподдерживаемые символы на '?',
        // поэтому явно настраиваем энкодер на REPORT, чтобы получить ошибку кодирования.




        // Вывод результатов измерений

    }
}