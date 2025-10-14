package ru.javarush.java.core.level15.task20;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект через "быструю" регистрацию (без параметров).
        // Сначала сработает нестатический блок (временный ID), затем сообщение конструктора.
        UserProfile fastRegistration = new UserProfile();

        // Создаем объект через "полную" регистрацию с именем "Дарья".
        // Снова сначала сработает блок инициализации, затем конструктор с параметром.
        UserProfile fullRegistration = new UserProfile("Дарья");
    }
}