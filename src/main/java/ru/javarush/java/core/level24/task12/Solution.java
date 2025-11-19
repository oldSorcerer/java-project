package ru.javarush.java.core.level24.task12;

public class Solution {
    // Инициирует первый сбой без первопричины (cause == null)
    public static void initiateSystemFailure() throws ... {

    }

    // Вызывает initiateSystemFailure и, при сбое, оборачивает его во второй уровень
    public static void triggerNavigationMalfunction() throws ... {

    }

    // Вызывает triggerNavigationMalfunction и, при сбое, оборачивает его в третий уровень
    public static void provokeLifeSupportCrisis() throws ... {

    }

    public static void main(String[] args) {
        try {
            // Запускаем цепочку сбоев
            provokeLifeSupportCrisis();
        } catch (... e) {
            // Печатаем полный стек-трейс с цепочкой причин (chained exceptions)
            e.printStackTrace();
        }
    }
}