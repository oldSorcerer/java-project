package ru.javarush.java.core.level29.task07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список для хранения участников
        List<Person> attendees = new ArrayList<>();

        // Заполняем список объектами Person с разными возрастами
        attendees.add(new Person("Иван", 21));
        attendees.add(new Person("Анна", 19));
        attendees.add(new Person("Сергей", 30));
        attendees.add(new Person("Мария", 25));
        attendees.add(new Person("Дмитрий", 22));

        // Сортируем список по возрасту (по возрастанию) с помощью анонимного класса Comparator

        

        // Выводим результат: "Имя, возраст" на каждой строке
        for (Person p : attendees) {
            System.out.println(p.personName + ", " + p.personAge);
        }
    }
}

// Простой класс Person с требуемыми полями.
class Person {
    public final String personName;
    public final int personAge;

    public Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }
}