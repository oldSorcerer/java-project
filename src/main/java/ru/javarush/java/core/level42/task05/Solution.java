package ru.javarush.java.core.level42.task05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Класс, описывающий артефакт. Реализует Serializable, чтобы его можно было сериализовать.
class Product {
    // Имя артефакта
    String artifactName;

    // Ценность артефакта
    int artifactValue;

    // Простой конструктор для инициализации полей
    Product(String artifactName, int artifactValue) {
        this.artifactName = artifactName;
        this.artifactValue = artifactValue;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Создаем артефакт с произвольными значениями
        Product mysticOrb = new Product("Mystic Orb", 777);

        // Сериализуем объект в бинарный файл "product.bin"
        // try-with-resources автоматически закроет поток даже при ошибках


        // Сообщение выводим только если сериализация прошла успешно
        
    }
}