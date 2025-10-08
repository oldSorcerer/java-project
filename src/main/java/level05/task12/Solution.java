package ru.javarush.java.core.level05.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int dragonHp = 50;
        int knightHits = 10;
        Scanner console = new Scanner(System.in);
        System.out.print("Вы напали на спящего дракона - дракон расстроился");

        // цикл боя
        while (knightHits > 0 && dragonHp > 0) {
            // Игрок указывает силу удара
            System.out.print("Сила удара (1-10): ");

            // Если слишком сильно или слишком слабо - то промах


            // отнимаем жизнь у дракона и ход у игрока


            // проверка, что дракон побежден

        }

        //проверка, что рыцарь проиграл

    }
}