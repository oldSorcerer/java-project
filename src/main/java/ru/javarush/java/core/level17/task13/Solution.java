package ru.javarush.java.core.level17.task13;

public class Solution {
    public static void main(String[] args) {
        // Создаём собаку — конкретный питомец, наследует все от Animal
        Dog bobik = new Dog();

        // Задаём имя питомца, присваивая значение полю petName
        bobik.petName = "Бобик";

        // Просим питомца поесть — метод унаследован от Animal
        bobik.eat();
    }
}