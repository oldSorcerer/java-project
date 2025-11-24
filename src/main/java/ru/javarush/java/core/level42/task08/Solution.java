package ru.javarush.java.core.level42.task08;

import java.io.*;

// Демонстрация transient-поля при сериализации/десериализации
public class Solution {
    // Класс Animal поддерживает сериализацию
    public static class Animal {


        String name;
        int age;
        String species;

        // Это поле помечено transient — оно не будет записано в поток при сериализации
        transient String secretHidingSpot;
    }

    public static void main(String[] args) throws Exception {
        // Создаём и заполняем "особое животное"
        Animal mysticalCreature = new Animal();
        mysticalCreature.name = "Shadow Lynx";
        mysticalCreature.age = 7;
        mysticalCreature.species = "Felis mystica";
        mysticalCreature.secretHidingSpot = "Under the old oak"; // секрет, не должен попасть в файл

        // Сериализация объекта в файл "animal2.bin"


        // Десериализация объекта из файла "animal2.bin"

        
        // transient-поле не сериализуется, поэтому после десериализации оно равно null

    }
}