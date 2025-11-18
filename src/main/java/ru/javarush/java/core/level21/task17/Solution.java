package ru.javarush.java.core.level21.task17;

public class Solution {
    public static void main(String[] args) {
        // Создаем два контейнера с разными значениями
        NumberBox boxA = new NumberBox(10);
        NumberBox boxB = new NumberBox(5);

        // Сравниваем их: положительное число — boxA больше boxB; отрицательное — меньше; ноль — равны
        int result = boxA.compareTo(boxB);

        // Выводим результат сравнения на экран
        System.out.println(result);
    }
}