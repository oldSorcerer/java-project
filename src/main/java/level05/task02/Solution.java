package ru.javarush.java.core.level05.task02;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения числа с клавиатуры
        Scanner console = new Scanner(System.in);
        int secretKeyCandidate = console.nextInt();

        // Числа <= 1 не являются простыми
        if (secretKeyCandidate <= 1) {
            System.out.println("NO");
            return;
        }

        boolean isPrime = true;

        // Проверяем делители от 2 до sqrt(n).
        // Условие i <= n / i эквивалентно i*i <= n, но без риска переполнения int.
        for (/* инициализация */; /* условие */; /* изменение */) {
            if (/* условие */) { // Нашли делитель — число составное

                break;
            }
        }

        // Выводим результат проверки

    }
}