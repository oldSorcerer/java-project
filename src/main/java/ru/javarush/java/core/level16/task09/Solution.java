package ru.javarush.java.core.level16.task09;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект MagicalCreature с помощью анонимного класса
        MagicalCreature magicalCreature = new MagicalCreature() {
            @Override
            void makeSound() {
                System.out.println("Ква-ква!");
            }
        };

        // Вызываем метод, чтобы услышать уникальный звук
        magicalCreature.makeSound();
    }
}

// Базовый класс с общим поведением
class MagicalCreature {
    void makeSound() {
        // Общий звук для любых магических существ
        System.out.println("Существо издаёт звук");
    }
}