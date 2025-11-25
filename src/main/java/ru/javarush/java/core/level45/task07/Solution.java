package ru.javarush.java.core.level45.task07;

import java.io.*;

// Для демонстрации в одном запуске мы используем два класса:
// 1) OldAnimal — "первая версия" (без цвета)
// 2) Animal    — "вторая версия" (с добавленным полем цвета)
// При чтении из файла мы подменяем имя класса OldAnimal на Animal через
// ObjectInputStream.resolveClass(...). Это имитирует ситуацию, когда
// старый файл читается новым классом с тем же serialVersionUID.
public class Solution {
    public static void main(String[] args) throws Exception {
        // 1) "Первая версия" системы: создаем объект без поля цвета и сериализуем его
        OldAnimal zebraV1 = new OldAnimal("Зебра", 350);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("animal.dat"))) {
            oos.writeObject(zebraV1); // сохраняем старую версию объекта
        }

        // 2) "Вторая версия" класса Animal: добавлено поле animalColor, serialVersionUID не меняем.
        // Десериализуем старый файл. При чтении маппим OldAnimal -> Animal.
        Animal loaded;
        try (ObjectInputStream ois = new MappingObjectInputStream(new FileInputStream("animal.dat"))) {
            loaded = (Animal) ois.readObject();
        }

        // Выводим все поля. animalColor должен быть null, т.к. его не было в старом файле
        System.out.println("animalType=" + loaded.animalType);
        System.out.println("animalWeight=" + loaded.animalWeight);
        System.out.println("animalColor=" + loaded.animalColor); // ожидается: null
    }
}