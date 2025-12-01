package ru.javarush.java.core.level62.task03;

import java.lang.reflect.Field;

public class Solution {
    public static void main(String[] args) {
        // Получаем объект Class исследуемого "устройства"


        // getFields() возвращает все public-поля


        // Выводим только имена найденных public-полей

    }
}

// Класс "устройство" с нужными полями
class Example {
    public int x;         // общедоступный счетчик (должен попасть в вывод)
    private String y;     // секретный код (не должен появиться)
    protected double z;   // защищенный показатель (не должен появиться)
}