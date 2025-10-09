package ru.javarush.java.core.level08.task15;

public class Solution {

    // Меняет местами значения первых двух элементов массива
    public static void swapPlayerNumbers(int[] teamLineup) {

    }

    public static void main(String[] args) {
        // Исходное расположение игроков: 7 и 9
        int[] playerSquad = {7, 9};

        // Передаем массив в метод — изменения произойдут над тем же объектом массива
        swapPlayerNumbers(playerSquad);

        // Проверяем результат: ожидается "9 7"
        System.out.println(playerSquad[0] + " " + playerSquad[1]);
    }
}