package ru.javarush.java.core.level08.task14;

public class Solution {

    public static void main(String[] args) {
        // Создаем массив с начальными бонусами игрока
        int[] myBonusCollection = {1, 2, 3};

        // Вызываем метод tryToSwapBonusList, передавая массив myBonusCollection
        tryToSwapBonusList(myBonusCollection);

        // Выводим первый элемент массива myBonusCollection
        // Ожидаем, что он останется равным 1, так как массивы передаются по значению ссылки
        System.out.println(myBonusCollection[0]);
    }

    public static void tryToSwapBonusList(int[] playerCurrentBonuses) {


    }
}