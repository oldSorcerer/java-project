package ru.javarush.java.core.level43.task05;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем объект и заполняем все поля
        Person original = new Person("Ada", "Lovelace", 36);

        // Сериализуем объект в память (в байтовый массив)
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(original); // Для Externalizable будет вызван writeExternal
        }

        // Десериализуем объект из памяти
        byte[] data = baos.toByteArray();
        Person restored;
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            restored = (Person) ois.readObject(); // Для Externalizable будет вызван readExternal
        }

        // Выводим восстановленные поля.
        // По условию: userFirstName и userAge восстановлены, а userLastName должен быть null.
        System.out.println("Восстановленные данные:");
        System.out.println("Имя: " + restored.userFirstName);
        System.out.println("Фамилия: " + restored.userLastName); // ожидается: null
        System.out.println("Возраст: " + restored.userAge);
        System.out.println("Фамилия == null? " + (restored.userLastName == null));
    }
}