package ru.javarush.java.core.level16.task03;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект библиотеки
        Library library = new Library();

        // Создаем объект нестатического внутреннего класса через объект внешнего класса
        // Синтаксис library.new Scroll(...) обязателен для non-static inner классов
        Library.Scroll scroll = library.new Scroll("Ancient Runes");

        // Показываем название свитка
        scroll.revealTitle();
    }
}