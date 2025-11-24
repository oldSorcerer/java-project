package ru.javarush.java.core.level41.task03;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Solution {
    public static void main(String[] args) throws Exception {


        // Готовим исходные данные (1..10), чтобы задача была воспроизводима.
        // Это не часть "двух точных операций" из условия, а только подготовка файла.


        // Открываем файл через FileChannel для чтения и записи


        // Устанавливаем позицию курсора на пятый байт.
        // В FileChannel позиция считается с нуля, поэтому индекс 4 — это 5-й байт.


        // Обрезаем файл до 7 байтов.
        // Так как текущая позиция (4) меньше нового размера (7),
        // позиция останется неизменной (на пятом байте).


        // Ресурсы закроются автоматически благодаря try-with-resources


    }

    // Подготавливаем файл: записываем байты 1..10 через FileChannel + ByteBuffer (в духе лекции 202)
    private static void prepareInitialFile(Path path) throws IOException {








        // переключаем буфер в режим чтения (для записи в канал)

    }
    
}