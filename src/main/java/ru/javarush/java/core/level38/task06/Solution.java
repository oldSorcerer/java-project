package ru.javarush.java.core.level38.task06;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;

public class Solution {
    public static void main(String[] args) throws Exception {
        Path file = Path.of("check.txt");

        // 1) Создаем файл и записываем в него тестовую строку — наш "оригинал"


        // 2) Вычисляем SHA-256-хеш содержимого файла с помощью стандартного класса MessageDigest


        // 3) Сравниваем с заведомо неправильной контрольной суммой


        // 4) При несовпадении выводим предупреждение

    }

    // Утилитный метод: перевод массива байт в hex-строку (нижний регистр)
    private static String toHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}