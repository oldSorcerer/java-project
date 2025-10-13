package ru.javarush.java.core.level14.task17;

public class Solution {
    public static void main(String[] args) {
        // "Рождаем" животное без явной инициализации полей
        Animal wildAnimal = new Animal();

        // Выводим значения полей: для int по умолчанию 0, для String — null
        System.out.println(wildAnimal.animalAge);
        System.out.println(wildAnimal.animalName);
    }
}

// Простой шаблон животного: поля не инициализируются вручную