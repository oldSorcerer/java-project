package ru.javarush.java.core.level43.task08;

import java.io.*;

// Демонстрация механизма writeReplace/readResolve для маскировки секретных данных
public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаём исходный аккаунт с секретом
        Account original = new Account("aurora.shield", "ULTRA-SECRET-123");

        // Сериализуем объект в массив байт (симулируем сохранение на диск)
        byte[] data;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(original);
            data = baos.toByteArray();
        }

        // Десериализуем обратно
        Account restored;
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bais)) {
            restored = (Account) ois.readObject(); // Здесь вернётся Account, восстановленный из прокси
        }

        // Выводим результат: username совпадает, secret — пустая строка
        System.out.println(restored.getUsername());
        System.out.println(restored.getSecret()); // ожидается пустая строка
    }
}