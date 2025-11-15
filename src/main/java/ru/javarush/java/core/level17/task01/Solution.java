package ru.javarush.java.core.level17.task01;

public class Solution {
    public static void main(String[] args) {
        // Создаем кота и задаем ему имя через поле petName
        Cat cat = new Cat();
        cat.petName = "Барсик";

        // Вызываем действия кота в требуемом порядке
        cat.eat();
        cat.meow();
    }
}