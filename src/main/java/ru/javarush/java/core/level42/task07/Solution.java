package ru.javarush.java.core.level42.task07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Solution {
    public static void main(String[] args) {
        // Создаем первого "цифрового питомца"
        Animal myPet = new Animal("Барсик", 4);

        // Сериализуем объект myPet в файл "animal.bin"
        // Используем ObjectOutputStream вместе с FileOutputStream

    }
}

// Класс Animal "помечаем" как сериализуемый, чтобы его объекты можно было записывать в файл
class Animal{
    String animalName; // имя животного
    int animalAge;     // возраст животного

    // Простой конструктор для инициализации полей
    Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }
}