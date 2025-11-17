package ru.javarush.java.core.level19.task12;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив базового типа Payment: можно хранить любые его наследники
        Payment[] payments = new Payment[] {
                new CashPayment(),    // экземпляр оплаты наличными
                new OnlinePayment()   // экземпляр онлайн-оплаты
        };

        // Полиморфный вызов: для каждого объекта будет вызвана своя реализация process()
        for (Payment payment : payments) {
            payment.process();
        }
    }
}