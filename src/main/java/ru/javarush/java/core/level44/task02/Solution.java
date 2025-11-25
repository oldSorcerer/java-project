package ru.javarush.java.core.level44.task02;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем глубоко вложенную структуру: Person -> Address -> CityInfo
        CityInfo cityInfo = new CityInfo("Москва");
        Address address = new Address(cityInfo, "Тверская улица");
        Person person = new Person("Иван Петров", 30, address);

        // Сериализуем объект Person в файл deep.ser
        // try-with-resources автоматически закрывает поток
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("deep.ser"))) {
            out.writeObject(person);
        }

        // Десериализуем объект Person из файла deep.ser
        Person restored;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("deep.ser"))) {
            restored = (Person) in.readObject();
        }

        // Выводим все поля восстановленного объекта, включая вложенные
        System.out.println("Имя: " + restored.getName());
        System.out.println("Возраст: " + restored.getAge());
        System.out.println("Улица: " + restored.getAddress().getStreet());
        System.out.println("Город: " + restored.getAddress().getCityInfo().getCityName());
    }
}