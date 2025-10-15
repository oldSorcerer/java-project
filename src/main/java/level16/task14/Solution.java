package ru.javarush.java.core.level16.task14;

public class Solution {
    public static void main(String[] args) {
        // Демонстрация работы SecretKeeper
        SecretKeeper keeper = new SecretKeeper();
        keeper.revealSecret();
    }
}

// Класс-хранитель секрета
class SecretKeeper {
    // Приватное поле с секретом
    private String hiddenSecret = "Java — круто!";

    // Метод, внутри которого объявляется локальный класс
    public void revealSecret() {
        // Локальный класс, объявленный внутри метода


        // Создаём объект локального класса и раскрываем секрет

    }
}