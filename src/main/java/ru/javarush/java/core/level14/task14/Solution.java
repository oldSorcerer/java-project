package ru.javarush.java.core.level14.task14;

public class Solution {
    public static void main(String[] args) {
        // Регистрируем анонимного пользователя (конструктор без параметров)
        User user1 = new User();

        // Регистрируем пользователя с именем "Алиса" (конструктор с одним параметром)
        User user2 = new User("Алиса");

        // Выводим значения полей каждого пользователя
        System.out.println(user1.userName);
        System.out.println(user1.userAge);
        System.out.println(user2.userName);
        System.out.println(user2.userAge);

    }
}