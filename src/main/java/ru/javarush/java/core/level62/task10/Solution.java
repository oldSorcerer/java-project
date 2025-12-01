package ru.javarush.java.core.level62.task10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Solution {
    public static void main(String[] args) {
        // Реальная реализация "дешифровщика"
        DecryptionUnit real = new DecryptionUnitImpl();

        // Создаем динамический прокси, перехватывающий вызовы методов интерфейса DecryptionUnit




        // Демонстрация: вызов через прокси.
        // Сначала выведется сообщение с аргументами, затем произойдет сложение.

    }
}

// Интерфейс "дешифровщика"
interface DecryptionUnit {
    int decodeMessage(int partA, int partB);
}

// Реализация, выполняющая сложение
class DecryptionUnitImpl implements DecryptionUnit {
    @Override
    public int decodeMessage(int partA, int partB) {
        return partA + partB;
    }
}