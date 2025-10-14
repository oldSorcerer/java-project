package ru.javarush.java.core.level15.task18;

public class Solution {
    public static void main(String[] args) {
        // Создаем два объекта ShelterPet
        // Для каждого сначала отработает нестатический блок, затем конструктор
        ShelterPet first = new ShelterPet();
        ShelterPet second = new ShelterPet();
    }
}