package ru.javarush.java.core.level18.task18;

// Задача: абстрактный класс Animal и его наследник Dog, который реализует makeSound()
public class Solution {
    public static void main(String[] args) {
        // Демонстрируем полиморфизм: переменная базового типа ссылается на объект подкласса
        Animal pet = new Dog();
        pet.makeSound(); // Ожидаемый вывод: "Гав-гав!"
    }
}