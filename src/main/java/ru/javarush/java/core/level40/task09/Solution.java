package ru.javarush.java.core.level40.task09;

import java.nio.file.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Путь к папке 'watched' в текущей рабочей директории
        // Paths.get("watched") интерпретируется относительно user.dir


        // Создаем папку, если её нет (и недостающие родительские директории тоже)


        // Создаем сервис слежения за изменениями в файловой системе (NIO2)


            // Регистрируем папку только на события создания (файлов и папок)
            // ENTRY_CREATE покрывает появление новых элементов внутри 'watched'


            // Сообщаем, что слежение настроено


    }
}