package ru.javarush.java.core.level20.task19;

// Демонстрация паттерна "Стратегия": переключаем стиль приветствия на лету.
public class Solution {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        // Сначала используем дружелюбную стратегию
        greeter.setStrategy(new FriendlyGreeting());
        greeter.greet("Вася");

        // Затем переключаемся на формальную стратегию
        greeter.setStrategy(new FormalGreeting());
        greeter.greet("Вася");
    }
}