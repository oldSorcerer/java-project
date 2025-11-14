package ru.javarush.java.core.level15.task17;

public class Solution {
    public static void main(String[] args) {
        // Создание объекта спровоцирует загрузку класса (если ещё не загружен)
        // и выполнит статический блок ровно один раз.
        new ApplicationModule();

        // Никакого дополнительного вывода здесь быть не должно.
    }
}