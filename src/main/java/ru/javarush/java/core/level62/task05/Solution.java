package ru.javarush.java.core.level62.task05;

import java.lang.reflect.Field;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект с "запертым дневником"
        SecretInfo info = new SecretInfo();

        try {
            // Узнаем "имя дневника" и получаем Field по имени


            // Пытаемся прочитать приватное поле без "отмычек"


            // Если каким-то образом получилось (что в норме не должно) — выведем значение
            System.out.println("Содержимое дневника: " + value);
        } catch (IllegalAccessException e) {
            // Ожидаемое препятствие: доступ к приватному полю без setAccessible запрещен

        } catch (NoSuchFieldException e) {
            // На случай, если поле переименовали или удалили

        }
    }
}

// Класс с приватным полем — "запертый дневник"
class SecretInfo {
    // Приватная запись, к которой нельзя напрямую обратиться через рефлексию без ослабления доступа
    private String hiddenMessage = "Привет, мир!";
}