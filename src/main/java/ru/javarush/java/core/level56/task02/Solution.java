package ru.javarush.java.core.level56.task02;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Подготавливаем данные для записи в файл
        String message = "Hello, async world!";
        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes(StandardCharsets.UTF_8));

        Path path = Paths.get("output.txt");

        // Открываем асинхронный файловый канал:


            // Асинхронно записываем буфер в файл с позиции 0


            // Ожидаем завершения операции и получаем количество записанных байт


            // Выводим количество записанных байт на экран

        
    }
}