package ru.javarush.java.core.level45.task06;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Небольшая демонстрация: создадим объект новой версии, сериализуем и десериализуем его.
        Person modern = new Person(33);

        byte[] data;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(modern);
            data = bos.toByteArray();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            Person restored = (Person) ois.readObject();
            System.out.println("Возраст (новый формат): " + restored.getCalculatedAge());
        }

        // Примечание:
        // Для реальной проверки backward-совместимости нужен файл,
        // сериализованный старой версией класса Person (с полем birthYearString).
        // Код ниже умеет корректно прочитать такой файл и вычислить возраст.
        // Добавлять бинарные тестовые файлы по условию не требуется.
    }
}