package ru.javarush.java.core.level15.task03;

public class Solution {
    public static void main(String[] args) {
        // Создаём участника Иван, 25 лет
        Person person = new Person("Иван", 25);

        // Пытаемся установить некорректный возраст (-5) — должно появиться сообщение об ошибке,
        // а возраст остаться без изменений
        person.setMemberAge(-5);
        System.out.println(person.getMemberAge()); // Ожидается: 25

        // Теперь устанавливаем корректный возраст (35)
        person.setMemberAge(35);
        System.out.println(person.getMemberAge()); // Ожидается: 35
    }
}