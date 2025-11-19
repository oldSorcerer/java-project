package ru.javarush.java.core.level24.task08;

// Главный класс с точкой входа и методом tryAddItem
public class Solution {

    // Метод пытается "добавить" value предметов при лимите limit
    // Если value > limit — бросаем наше пользовательское исключение с деталями
    public static void tryAddItem(int value, int limit) throws ... {

            // Формируем понятное сообщение и передаем вместе с деталями


        // Если всё в порядке — просто сообщаем об успехе
        System.out.println("Операция успешна!");
    }

    public static void main(String[] args) {
        try {
            // Симулируем попытку добавить 150 при лимите 100
            tryAddItem(150, 100);
        } catch (... e) {
            // Перехватываем и выводим сообщение об ошибке и точные детали
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Текущее значение: " + e.getCurrentItemCount());
            System.out.println("Лимит: " + e.getMaximumCapacity());
        }
    }
}