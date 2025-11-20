package ru.javarush.java.core.level32.task09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Создаём список со значением null внутри.
        List<String> pets = Arrays.asList("cat", null, "dog");
        System.out.println("Исходные данные: " + pets);


        // Пытаемся "в лоб" привести все элементы к верхнему регистру.
        // На элементе null произойдёт попытка вызвать метод у null -> NullPointerException.


        // До этого места выполнение не дойдёт из-за исключения.
        System.out.println("Результат: " + upper);
    }
}