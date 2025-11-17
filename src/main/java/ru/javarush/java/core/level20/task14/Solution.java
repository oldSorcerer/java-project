package ru.javarush.java.core.level20.task14;

public class Solution {
    public static void main(String[] args) {
        // Лямбда-реализация: возвращает true, если число больше 100
        NumberChecker checker = n -> n > 100;

        // Демонстрация работы на значениях 50 и 150
        System.out.println(checker.check(50));   // ожидаем false
        System.out.println(checker.check(150));  // ожидаем true
    }
}