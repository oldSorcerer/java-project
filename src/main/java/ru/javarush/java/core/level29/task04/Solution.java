package ru.javarush.java.core.level29.task04;

import java.util.Comparator;
import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        // Создаем двух участников
        Person anna = new Person("Анна");
        Person boris = new Person("Борис");

        // Создаем компаратор по имени
        PersonByNameComparator comparator = new PersonByNameComparator();

        // Сравниваем через Objects.compare, передавая компаратор
        int result = Objects.compare(anna, boris, comparator);

        // Выводим вердикт по результату сравнения
        if (result < 0) {
            System.out.println("Анна идет раньше Бориса");
        } else if (result > 0) {
            System.out.println("Борис идет раньше Анны");
        } else {
            System.out.println("Имена совпадают");
        }
    }
}