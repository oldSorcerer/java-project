package ru.javarush.java.core.level01.task07;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные для хранения очков двух игроков и сразу инициализируем их нужными значениями
        int player1Score = 1999;
        int player2Score = 25;

        // Вычисляем общую сумму очков
        int totalScore = player1Score + player2Score;

        // Выводим на экран значение общей суммы очков
        System.out.println(totalScore);
    }
}