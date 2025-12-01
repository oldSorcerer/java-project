package ru.javarush.java.core.level63.task09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    // Ровно 500 000 итераций
    private static final int ITERATIONS = 500_000;

    // Держим ссылки в статическом поле, чтобы объекты гарантированно оставались достижимыми
    // до окончания программы (их можно будет увидеть в профилировщике).


    public static void main(String[] args) {
        // Намеренно "мусорим": создаём 500 000 НОВЫХ объектов String с одинаковым содержимым.
        // Ключевой момент — использование конструктора new String("hello"),
        // что гарантирует создание нового объекта, а не использование строкового пула.


        // Небольшая информация для контроля


        // Пауза: даём время подключиться VisualVM и проанализировать память процесса.
        System.out.println("Подключите VisualVM, сделайте анализ/heap dump, затем нажмите Enter для завершения.");
        Scanner console = new Scanner(System.in);
        console.nextLine(); // программа ждёт, объекты остаются в памяти и видны профилировщику
    }
}