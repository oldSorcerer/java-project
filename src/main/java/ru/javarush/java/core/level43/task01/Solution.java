package ru.javarush.java.core.level43.task01;

import java.io.*;

// Демонстрационная программа: создаем кота, сериализуем и десериализуем его.
// На экран должны выводиться сообщения только из writeObject и readObject.
public class Solution {
    public static void main(String[] args) throws Exception {
        Cat original = new Cat("Мурзик", 3);

        // Сериализуем объект в память (в массив байт), чтобы не создавать файлы
        byte[] data;
        try (ByteArrayOutputStream buffer = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(buffer)) {
            oos.writeObject(original); // Здесь вызовется Cat.writeObject(...)
            data = buffer.toByteArray();
        }

        // Десериализуем объект из памяти
        try (ByteArrayInputStream input = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(input)) {
            Cat restored = (Cat) ois.readObject(); // Здесь вызовется Cat.readObject(...)
            // Ничего не печатаем, чтобы удовлетворить требование "сообщения только при (де)сериализации".
            // Состояние restored совпадает с original благодаря стандартной сериализации.
        }
    }
}