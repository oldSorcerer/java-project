package ru.javarush.java.core.level41.task07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Размер буфера задаём одной переменной (8 МБ) — "гигантский грузовик"


        // try-with-resources гарантирует корректное закрытие потоков


        // буфер фиксированного размера


        // Читаем и пишем блоками, ровно столько байт, сколько было прочитано




        // Сообщение выводим только при успешном завершении копирования


    }
}