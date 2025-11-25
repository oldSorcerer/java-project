package ru.javarush.java.core.level43.task10;

import java.io.*;

// Главный класс решения
public class Solution {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "customer.ser";

        // 1) Создаем объект клиента
        Customer customer = new Customer("Иван Иванов", "ivan@example.com");

        // 2) Сериализуем объект в файл
        // try-with-resources автоматически закроет поток после записи
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(customer);
        }

        // 3) Десериализуем объект из файла
        Object restored;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            restored = in.readObject(); // Возвращает Object, дальнейшая проверка — через instanceof
        }

        // 4) Проверяем тип десериализованного объекта
        if (restored instanceof Customer) {
            System.out.println("Объект типа Customer успешно десериализован!");
        } else {
            System.out.println("Ошибка типа объекта: восстановлен не клиентский файл!");
        }
    }
}