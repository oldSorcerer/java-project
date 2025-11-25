package ru.javarush.java.core.level44.task01;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        // 1) Создаем и заполняем вложенный объект Address
        Address address = new Address();
        address.city = "Москва";
        address.street = "Тверская, 10";

        // 2) Создаем и заполняем объект Person, включая адрес
        Person person = new Person();
        person.name = "Иван Петров";
        person.age = 30;
        person.address = address;

        // 3) Сериализация объекта Person в файл "person.ser"
        // try-with-resources автоматически закроет поток
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person); // "Упаковываем" объект в бинарный файл
        }

        // 4) Десериализация объекта Person из файла "person.ser"
        Person restored;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            restored = (Person) ois.readObject(); // "Распаковываем" объект из файла
        }

        // 5) Проверка корректности восстановления: выводим все поля на экран
        System.out.println("Имя: " + restored.name);
        System.out.println("Возраст: " + restored.age);
        // Если всё прошло успешно, вложенный объект Address тоже восстановится
        System.out.println("Город: " + restored.address.city);
        System.out.println("Улица: " + restored.address.street);
    }
}