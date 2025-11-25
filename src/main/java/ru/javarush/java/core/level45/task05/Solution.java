package ru.javarush.java.core.level45.task05;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем объект новой версии (с полем author)
        Book original = new Book("Евгений Онегин", "Александр Пушкин");

        Path file = Paths.get("book.ser");

        // Запись объекта в файл (сериализация)
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(file))) {
            out.writeObject(original);
        }

        // Чтение объекта из файла (десериализация)
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(file))) {
            Book restored = (Book) in.readObject();
            System.out.println(restored);
        }
    }
}