package ru.javarush.java.core.level65.task02;

public class Solution {
    public static void main(String[] args) {
        // Создаем экземпляр ViberNotification (наследуется от SmsNotification)
        ViberNotification viber = new ViberNotification();

        // Подтверждаем создание нового типа оповещения
        System.out.println("ViberNotification создан");
    }
}