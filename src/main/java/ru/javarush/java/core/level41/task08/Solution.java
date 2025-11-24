package ru.javarush.java.core.level41.task08;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Solution {
    // Имя файла по условию


    // Ищем ASCII-последовательность "JAVA"


    // Размер окна для memory mapping (128 МБ — хороший баланс)


    public static void main(String[] args) {


        // Открываем файловый канал в режиме чтения и гарантируем закрытие ресурса




        if (fileSize < L) {


        }

        // Шаг сдвига окна: перекрываем соседние окна на (L - 1) байт,
        // чтобы не пропустить шаблон, начинающийся на границе двух окон





        // Отображаем текущий кусок файла в память (memory mapping)


        // Ищем первое вхождение "JAVA" внутри текущего окна

        // Быстрая проверка посимвольно (ASCII-байты)





        // Глобальная позиция в файле




        // MappedByteBuffer не требует явного закрытия: освобождается GC/OS.
        // Мы храним только одну ссылку за раз, поэтому удержания ресурса нет.


        // Если дошли сюда — вхождение не найдено


        // В учебной задаче упрощаем обработку: печатаем "Не найдено" при ошибке


    }
}