package ru.javarush.java.core.level24.task10;

import java.io.IOException;

public class Solution {

    // Этап 1: имитация сбоя при подготовке исходных данных
    public static void prepareSourceData() throws IOException {
        // Специально "падаем" с IOException с нужным сообщением

    }

    // Этап 2: загрузка/обработка сырых данных
    public static void processRawData() throws DataLoadingError {

    }

    // Этап 3: генерация итогового отчёта
    public static void generateFinalReport() throws DataLoadingError {

    }

    public static void main(String[] args) {
        try {
            generateFinalReport();
        } catch (DataLoadingError e) {
            // Выводим сообщение нашего исключения
            System.out.println(e.getMessage());

            // И сообщение первопричины (IOException)
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println(cause.getMessage());
            }
        }
    }
}

// Пользовательское исключение для обобщённой ошибки загрузки данных
class DataLoadingError extends Exception {
    public DataLoadingError(String message) {
        super(message);
    }

    public DataLoadingError(String message, Throwable cause) {
        super(message, cause);
    }
}