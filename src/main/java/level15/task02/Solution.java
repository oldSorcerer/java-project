package ru.javarush.java.core.level15.task02;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Person с именем "Анна" и возрастом 30
        Person person = new Person("Анна", 30);

        // Получаем имя и возраст через геттеры и выводим их на консоль
        System.out.println("Имя: " + person.getMemberName());
        System.out.println("Возраст: " + person.getMemberAge());
    }
}