package ru.javarush.java.core.level34.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Изменяемая корзина товаров
        List<String> cart = new ArrayList<>();
        cart.add("товар X");
        cart.add("товар Y");

        // Защищенное представление (обертка) над корзиной:


        // Независимая копия корзины (снимок на текущий момент):


        // Добавляем новый товар в исходную корзину уже после создания представлений


        // Демонстрация различий:
        // Обертка покажет добавленный элемент, снимок — нет.


        // Будет ошибка (UnsupportedOperationException), т.к. protectedView — только для чтения:

    }
}