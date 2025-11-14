package ru.javarush.java.core.level16.task01;

public class Solution {
    public static void main(String[] args) {
        // Создаем коробку
        Box box = new Box();

        // Создаем этикетку, связанную с этой коробкой.
        // Для создания экземпляра внутреннего класса нужен экземпляр внешнего класса.
        Box.Label label = box.new Label();

        // Вызываем метод печати этикетки
        label.printLabel();
    }
}