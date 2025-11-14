package ru.javarush.java.core.level16.task05;

public class Solution {
    public static void main(String[] args) {
        // Создаём экземпляр статического вложенного класса
        // Важно: объект внешнего класса Spellbook не нужен
        Spellbook.BasicCharm charm = new Spellbook.BasicCharm();

        // Активируем заклинание
        charm.castSpell();
    }
}