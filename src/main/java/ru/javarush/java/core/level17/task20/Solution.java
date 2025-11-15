package ru.javarush.java.core.level17.task20;

public class Solution {
    public static void main(String[] args) {
        // Полиморфизм: ссылка типа Animal указывает на объект фактического типа Cat
        Animal mysteriousCreature = new Cat();

        // Вызов sleep() приведёт к вызову Cat.makeSound() благодаря динамическому связыванию
        mysteriousCreature.sleep();
    }
}