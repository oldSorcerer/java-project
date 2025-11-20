package ru.javarush.java.core.level33.task06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Обычный изменяемый список — мастер-список ингредиентов
        List<String> masterRecipeIngredients = new ArrayList<>();
        masterRecipeIngredients.add("Java");
        masterRecipeIngredients.add("Python");

        // Неизменяемое представление (обёртка) поверх мастер-списка.
        // Это не копия, а "вид" на исходный список: изменения в мастер-списке будут видны здесь.


        // Изменяем исходный мастер-список после создания представления


        // Выводим содержимое "гостевого меню": должно быть [Java, Python, C++]
        // Непосредственно менять apprenticeRecipeView нельзя — он неизменяемый.
        System.out.println(apprenticeRecipeView);
    }
}