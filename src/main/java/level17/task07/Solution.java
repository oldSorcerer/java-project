package ru.javarush.java.core.level17.task07;

public class Solution {
    public static void main(String[] args) {
        // Полиморфизм: переменная типа Parent ссылается на объект типа Child
        Parent person = new Child();

        // Динамический полиморфизм: вызывается версия метода из класса Child
        person.greet(); // Ожидаемый вывод: "Hello from Child"
    }
}