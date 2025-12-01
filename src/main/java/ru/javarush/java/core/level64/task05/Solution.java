package ru.javarush.java.core.level64.task05;

import java.lang.ref.WeakReference;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        // Создаем новый объект String в куче (а не просто используем литерал из пула строк),
        // чтобы этот объект мог быть собран GC, когда исчезнут сильные ссылки.
        String message = new String("Weak reference example");

        // Создаем слабую ссылку на строку


        // "Забываем" о послании: убираем все сильные ссылки на объект строки


        // Просим сборщик мусора выполнить сборку (это лишь запрос, не гарантия немедленного выполнения)


        // Небольшая пауза, чтобы дать GC шанс освободить память (для демонстрации)


        // Пытаемся прочитать послание через слабую ссылку


        // Корректно обрабатываем ситуацию, когда объект уже удалён
        if (result == null) {
            System.out.println("Послание исчезло: объект удалён сборщиком мусора.");
        } else {
            System.out.println("Послание ещё доступно: " + result);
        }
    }
}