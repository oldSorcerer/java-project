package ru.javarush.java.core.level14.task09;

public class Solution {
    public static void main(String[] args) {
        // Создаем нового кота с именем "Барсик" и возрастом 3 года (используем "new" и конструктор)
        Cat cat = new Cat("Барсик", 3);

        // Выводим имя и возраст кота, чтобы подтвердить корректность создания объекта
        System.out.println(cat.catName);
        System.out.println(cat.catAge);
    }
}

// Шаблон (класс) кота с полями для имени и возраста
class Cat {
    String catName;
    int catAge;

    public Cat(String catName, int catAge) {
        this.catName = catName;
        this.catAge = catAge;
    }
}