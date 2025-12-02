package ru.javarush.java.core.level65.task03;

public class Solution {

    // Метод-анализатор: определяет тип объекта с помощью pattern matching в instanceof
    public static void printTypeInfo(Object dataObject) {
        // Если объект — строка, сопоставляем и сразу получаем переменную s нужного типа

        // Если объект — любое число (наследник Number), сопоставляем в переменную n

        // Иначе — тип нам неизвестен (включая случай null)

    }

    public static void main(String[] args) {
        // Небольшая демонстрация работы метода на разных объектах
        printTypeInfo("Привет, Java!");
        printTypeInfo(42);                    // Integer
        printTypeInfo(3.14);                  // Double
        printTypeInfo(new java.math.BigInteger("12345678901234567890")); // Другое Number
        printTypeInfo(true);                  // Не Number и не String
        printTypeInfo(null);                  // null тоже попадёт в "Неизвестный тип"
    }
}