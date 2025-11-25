package ru.javarush.java.core.level43.task07;

import java.io.*;

// Демонстрация сериализации с сохранением синглтона
public class Solution {
    public static void main(String[] args) throws Exception {
        // Получаем единственный экземпляр Нексуса
        SimpleSingleton original = SimpleSingleton.getInstance();

        // Сериализуем объект в файл "singleton.bin"
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.bin"))) {
            out.writeObject(original);
        }

        // Десериализуем объект из файла "singleton.bin"
        SimpleSingleton deserialized;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.bin"))) {
            deserialized = (SimpleSingleton) in.readObject();
        }

        // Проверяем, что это один и тот же объект (должно вывести true)
        System.out.println(original == deserialized);
    }
}