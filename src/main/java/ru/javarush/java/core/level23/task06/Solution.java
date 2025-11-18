package ru.javarush.java.core.level23.task06;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект собаки
        Dog dog = new Dog();

        // Вызываем унаследованный метод без параметров (не переопределен в Dog)
        dog.makeSound(); // Выведет: Some sound

        // Вызываем перегруженную версию метода с параметром
        dog.makeSound("громко"); // Выведет: Bark! громко
    }
}