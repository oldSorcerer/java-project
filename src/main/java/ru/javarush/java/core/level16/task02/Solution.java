package ru.javarush.java.core.level16.task02;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Person с именем "Anna"
        Person person = new Person("Anna");

        // Создаем объект внутреннего класса Greeting через объект внешнего класса
        // Синтаксис person.new Greeting() обязателен для non-static inner классов
        Person.Greeting greeting = person.new Greeting();

        // Вызываем метод, который выводит приветствие
        greeting.sayHello();
    }
}