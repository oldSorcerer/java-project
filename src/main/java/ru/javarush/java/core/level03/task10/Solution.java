package ru.javarush.java.core.level03.task10;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и присваиваем счёт нашей команды и соперника
        int ourScore = 1;
        int opponentScore = 3;

        // weWon — результат логического сравнения: true, если наш счёт больше
        boolean weWon = ourScore > opponentScore;

        // Выводим значение переменной weWon на экран
        System.out.println(weWon);
    }
}