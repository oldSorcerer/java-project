package ru.javarush.java.core.level15.task05;

public class Solution {
    public static void main(String[] args) {
        // Создаем визитку и задаем имя владельца
        UserCard card = new UserCard("Элис");

        // Получаем имя через геттер и выводим на экран
        System.out.println(card.getUserName());
    }
}