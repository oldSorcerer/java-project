package ru.javarush.java.core.level18.task02;

public class Solution {
    public static void main(String[] args) {
        // Массив типа Animal хранит ссылки на разные конкретные животные.
        Animal[] pen = { new Cat(), new Cow() };

        // Полиморфизм: вызывается версия makeSound() конкретного объекта,
        // даже если переменная имеет тип базового класса Animal.
        for (Animal animal : pen) {
            animal.makeSound(); // Ожидаемый вывод: "Мяу!" затем "Мууу!"
        }
    }
}