package ru.javarush.java.core.level44.task04;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // 1) Создаём магазин и наполняем как минимум двумя категориями и по одному товару в каждой.
        Store store = new Store();
        store.addProduct("Food", new FoodProduct("Яблоко", 52));
        store.addProduct("Tech", new TechProduct("Смартфон", 24));

        // 2) Сериализуем магазин в файл "store.ser".
        // Используем try-with-resources, чтобы потоки закрылись автоматически.
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("store.ser"))) {
            out.writeObject(store);
        } catch (IOException e) {
            // В учебной задаче — простое сообщение об ошибке.
            System.out.println("Ошибка сериализации: " + e.getMessage());
            return;
        }

        // 3) Десериализуем магазин из файла "store.ser".
        Store restored;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("store.ser"))) {
            restored = (Store) in.readObject(); // Читаем обратно объект Store
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка десериализации: " + e.getMessage());
            return;
        }

        // 4) Проходим по всем категориям и выводим имена и типы всех товаров.
        for (Map.Entry<String, List<Product>> entry : restored.getProducts().entrySet()) {
            String category = entry.getKey();
            System.out.println("Категория: " + category);
            for (Product p : entry.getValue()) {
                // getClass().getSimpleName() выводит конкретный тип товара (FoodProduct/TechProduct).
                System.out.println(" - " + p.getName() + " [" + p.getClass().getSimpleName() + "]");
            }
        }
    }
}