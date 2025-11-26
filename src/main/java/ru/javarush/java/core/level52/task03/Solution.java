package ru.javarush.java.core.level52.task03;

public class Solution {
    public static void main(String[] args) {
        // Имитация двух поступивших пожертвований
        CharityFund.recordDonation(10);
        CharityFund.recordDonation(5);

        // Получаем и выводим общую сумму: ожидается 15
        System.out.println(CharityFund.getOverallTotal());
    }
}