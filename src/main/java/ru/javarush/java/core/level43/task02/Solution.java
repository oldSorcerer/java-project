package ru.javarush.java.core.level43.task02;

import java.io.*;

// Точка входа: создаем профиль, сериализуем его, затем читаем обратно и проверяем поля
public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем профиль и заполняем все поля
        Profile original = new Profile("Hero123", "hero@example.com", 9001);

        // Сохраняем объект в бинарный файл
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("profile.bin"))) {
            out.writeObject(original);
        }

        // Восстанавливаем объект из файла
        Profile restored;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("profile.bin"))) {
            restored = (Profile) in.readObject();
        }

        // Выводим все поля восстановленного профиля
        System.out.println("После десериализации:");
        System.out.println("playerUsername = " + restored.getPlayerUsername());
        System.out.println("playerEmail = " + restored.getPlayerEmail()); // должен быть null
        System.out.println("playerScore = " + restored.getPlayerScore());
    }
}