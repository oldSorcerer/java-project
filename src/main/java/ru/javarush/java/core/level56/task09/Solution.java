package ru.javarush.java.core.level56.task09;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) {
        // Строка, которую необходимо записать в файл
        String content = "Hello, async world!";
        // Преобразуем строку в массив байтов в кодировке UTF-8 и упаковываем в ByteBuffer
        ByteBuffer buffer = ByteBuffer.wrap(content.getBytes(StandardCharsets.UTF_8));

        // Задаём путь к новому файлу; StandardOpenOption.CREATE_NEW гарантирует, что файл будет создан заново
        Path filePath = Paths.get("message.txt");

        // Используем try-with-resources для автоматического закрытия канала после выполнения блока
        try (... ) {
            // Запускаем асинхронную операцию записи в позицию 0


            // Ожидаем завершения операции записи (блокирует текущий поток, но не UI-поток)


            // После выхода из try-with-resources канал будет автоматически закрыт
        } catch (IOException e) {
            // Ошибка работы с файловой системой (например, файл уже существует или нет прав)
            e.printStackTrace();
        } catch (InterruptedException | ExecutionException e) {
            // Ошибка выполнения асинхронной операции (прерывание или исключение в процессе записи)
            e.printStackTrace();
        }
    }
}