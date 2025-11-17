package ru.javarush.java.core.level20.task01;

public class Solution {
    public static void main(String[] args) {
        // Демонстрация работы: создаем человека и просим его поздороваться
        Greetable someone = new Person();
        someone.greet();
    }
}