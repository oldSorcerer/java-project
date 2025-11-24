package ru.javarush.java.core.level41.task05;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Solution {
    public static void main(String[] args) throws IOException {
        // используем тестовый large.txt в текущей папке
        String path = "large.txt";


        // Открываем файл в режиме чтения
        // "Перепрыгиваем" ровно на 1000-й байт от начала файла




        // Пытаемся прочитать ровно 256 байт, но корректно обрабатываем конец файла:
        // читаем только доступные байты (read может вернуть меньше запрошенного)






        // Выводим количество реально прочитанных байт


    }
}