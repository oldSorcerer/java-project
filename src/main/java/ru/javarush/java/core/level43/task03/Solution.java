package ru.javarush.java.core.level43.task03;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Person с любыми данными
        Person person = new Person("Алиса", 30);

        // Выводим объект на экран — вызовется метод toString()
        System.out.println(person);
    }
}