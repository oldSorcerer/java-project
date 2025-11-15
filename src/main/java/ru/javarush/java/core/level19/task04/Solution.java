package ru.javarush.java.core.level19.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаем платеж PayPal и последовательно вызываем общую и специфичную логику
        PaypalPayment payment = new PaypalPayment();
        payment.printInfo();   // сначала общая информация
        payment.process();     // затем специфическая обработка
    }
}