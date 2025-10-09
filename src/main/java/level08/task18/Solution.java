package ru.javarush.java.core.level08.task18;

// Главный офис банка с методом main
public class Solution {
    public static void main(String[] args) {
        // Создаем объект класса CustomerBankAccount с именем myPrivateAccount


        // Пополняем баланс только через публичный метод


        // Попытка прямого доступа к приватному полю извне класса:
        
    }
}

// Класс секретного банковского счета клиента
class CustomerBankAccount {
    // Приватное поле — к нему нельзя обращаться напрямую из других классов
    private int accountBalance;

    // Публичный метод для контролируемого пополнения счета
    public void depositMoney(int amountToDeposit) {
        // Увеличиваем баланс на указанную сумму
        accountBalance += amountToDeposit;
    }
}