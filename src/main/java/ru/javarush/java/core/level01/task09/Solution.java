package ru.javarush.java.core.level01.task09;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные типа int и присваиваем им значения
        int itemPrice = 4;
        int itemCount = 3;
        int discount = 2;

        // Вычисляем итоговую стоимость заказа
        int totalCost = (itemPrice + itemCount) * discount;

        // Формируем итоговое сообщение
        String finalMessage = "Итоговая стоимость: " + totalCost;

        // Выводим итоговое сообщение на экран
        System.out.println(finalMessage);
    }
}