package ru.javarush.java.core.level14.task08;

public class Solution {
    public static void main(String[] args) {
        // Открываем счёт с заданным начальным балансом
        BankAccount bankAccount1 = new BankAccount("Owner", 100);

        // Открываем счёт только с именем (баланс будет установлен в 0)
        BankAccount  bankAccount2 = new BankAccount("Owner");


        // Пополняем второй счёт на 500 единиц
        bankAccount2.deposit(500);

        // Выводим информацию о каждом счёте
        bankAccount1.printInfo();
        bankAccount2.printInfo();
    }
}

// Класс банковского счёта с владельцем и текущим балансом
class BankAccount {
    private String accountOwner;
    private int accountBalance;

    public BankAccount(String accountOwner, int accountBalance) {
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String accountOwner) {
        this.accountOwner = accountOwner;
        this.accountBalance = 0;
    }

    public void deposit(int amount) {
        accountBalance = accountBalance + amount;
    }

    public void printInfo() {
        System.out.printf("Владелец: %s, баланс: %d%n", accountOwner, accountBalance);
    }
}