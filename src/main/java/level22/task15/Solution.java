package ru.javarush.java.core.level22.task15;

public class Solution {
    public static void main(String[] args) {
        // Создаем персонажа с именем "Иван" и возрастом 25
        Person ivan = new Person("Иван", 25);

        // Вызываем метод приветствия и выводим результат
        System.out.println(ivan.greeting());
    }
}