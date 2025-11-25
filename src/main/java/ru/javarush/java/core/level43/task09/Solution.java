package ru.javarush.java.core.level43.task09;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        // Создаем пример артефакта
        Product original = new Product("Кристалл Астрала");
        File file = new File("artifact.bin");

        // Сериализация: записываем объект в бинарный файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(original); // запись объекта в поток
            System.out.println("Сериализовано: " + original);
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации: " + e.getMessage());
            return; // Если не удалось записать — дальше нет смысла продолжать
        }

        // Десериализация: читаем объект обратно из файла
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            // В реальных приложениях для безопасности стоит ограничивать допустимые типы через ObjectInputFilter
            Product restored = (Product) ois.readObject(); // чтение и приведение к нужному типу
            System.out.println("Десериализовано: " + restored);

            // Простая проверка корректности данных
            if (original.getArtifactName().equals(restored.getArtifactName())) {
                System.out.println("Успех: артефакт восстановлен корректно.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при десериализации: " + e.getMessage());
        }
    }
}