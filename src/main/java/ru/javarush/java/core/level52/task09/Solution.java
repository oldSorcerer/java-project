package ru.javarush.java.core.level52.task09;

import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    public static void main(String[] args) {
        TransactionProcessor processor = new TransactionProcessor();

        int totalCalls = 7; // Сколько раз вызовем processTransaction()
        for (int i = 1; i <= totalCalls; i++) {
            try {
                processor.processTransaction();
                System.out.println("Транзакция #" + i + ": успешно обработана");
            } catch (RuntimeException e) {
                // Демонстрация: даже при исключении программа не зависает — блокировка освобождается в finally
                System.out.println("Транзакция #" + i + ": ошибка обработки (" + e.getMessage() + ")");
            }
        }

        // Проверяем, что счётчик соответствует количеству вызовов метода
        System.out.println("Всего вызовов processTransaction(): " + totalCalls);
        System.out.println("Итоговый transactionCount: " + processor.getTransactionCount());
    }
}