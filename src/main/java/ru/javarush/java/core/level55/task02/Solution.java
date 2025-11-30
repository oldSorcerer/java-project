package ru.javarush.java.core.level55.task02;

import java.util.concurrent.CompletableFuture;

public class Solution {
    public static void main(String[] args) {
        // Запускаем асинхронную "рискованную" транзакцию


        // Немедленно после запуска сообщаем о старте
        System.out.println("Старт задачи!");

        // Строим конвейер обработки:


        // Ждём завершения, чтобы программа не завершилась раньше времени

    }
}