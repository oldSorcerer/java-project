package ru.javarush.java.core.level16.task12;

// Главный класс с методом main
public class Solution {
    public static void main(String[] args) {
        // Создаем объект лаборатории и запускаем механизм раскрытия секрета
        SecureLab lab = new SecureLab();
        lab.revealSecret();
    }
}

// Класс секретной лаборатории
class SecureLab {
    // Приватное поле с секретом
    private final String classifiedSecret = "Секрет раскрыт!";

    // Метод, который "раскрывает" секрет через анонимный класс
    void revealSecret() {
        // Создаем объект интерфейса Runnable через анонимный класс
        Runnable revealMechanism = new Runnable() {
            @Override
            public void run() {
                System.out.println(classifiedSecret);
            }
        };

        // Вызываем метод run() прямо здесь, без создания отдельного потока
        revealMechanism.run();
    }
}