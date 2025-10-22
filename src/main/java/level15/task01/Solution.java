package ru.javarush.java.core.level15.task01;

public class Solution {
    public static void main(String[] args) {
        // Создаем экземпляр класса Person
        Person person = new Person();

        // Ниже — намеренные попытки прямого доступа к приватным полям.
//        person.memberName = "Alice"; // Ошибка компиляции: memberName имеет модификатор private
//        person.memberAge = 30;       // Ошибка компиляции: memberAge имеет модификатор private

        // Демонстрационное сообщение
        System.out.println("Экземпляр Person создан. Прямой доступ к полям memberName и memberAge запрещён (private).");
    }
}