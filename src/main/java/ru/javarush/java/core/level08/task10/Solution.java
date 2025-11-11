package ru.javarush.java.core.level08.task10;

public class Solution {
    // Метод проверяет, делится ли число на 2 без остатка
    public static boolean checkIfEven(int inputNumber) {
        // Оператор % возвращает остаток от деления
        return false;
    }

    public static void main(String[] args) {
        // Проверяем число 18
        boolean isEven = checkIfEven(18);

        // Выводим результат в зависимости от возвращенного значения
        if (isEven) {
            System.out.println("Это число чётное!");
        } else {
            System.out.println("Это число нечётное!");
        }
    }
}