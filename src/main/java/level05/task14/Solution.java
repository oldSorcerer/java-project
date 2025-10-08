package ru.javarush.java.core.level05.task14;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Стартовые очки здоровья
        int knightHp = 100;
        int dragonHp = 50;

        // Дракон загадывает скрытый максимум удара 2..20
        Random rand = new Random();
        int dragonMax = rand.nextInt(19) + 2;

        // Ввод силы удара рыцаря
        Scanner console = new Scanner(System.in);
        System.out.println("Битва началась! У рыцаря 100 жизней, у дракона 50 жизней.");

        // Основной боевой цикл
        while (true) {
            // Ход рыцаря: промах, если превышает скрытый максимум


            // Проверяем смерть дракона


            // Ход дракона: первая голова атакует


            // Ход дракона: вторая голова атакует

            
            // Текущий статус и проверка смерти рыцаря

        }
    }
}