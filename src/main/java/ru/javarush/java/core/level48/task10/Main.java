package ru.javarush.java.core.level48.task10;

public class Main {
    // Имя "рассказчика" — объекта класса Main
    String name = "Main";

    // В этом методе демонстрируем разницу между анонимным классом и лямбдой
    void test() {
        // 1) Анонимный класс с собственным полем name


        // 2) Лямбда-выражение: здесь this — это внешний объект Main


        // Последовательный вызов: сначала анонимный класс, потом лямбда

    }

    public static void main(String[] args) {
        // Создаем объект Main и запускаем демонстрацию
        new Main().test();
    }
}