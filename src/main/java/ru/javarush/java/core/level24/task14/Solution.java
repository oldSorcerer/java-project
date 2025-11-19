package ru.javarush.java.core.level24.task14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        // try-with-resources автоматически закроет файл после работы

                // Читаем первую строку настроек

            // Если строка отсутствует, считаем это ошибкой формата


            // Преобразуем строку в число (может выбросить NumberFormatException)


            // Для наглядности покажем загруженное значение


        
        // Один "умный" catch обрабатывает сразу два типа проблем:

    }
}