package ru.javarush.java.core.level22.task20;

public class Solution {
    public static void main(String[] args) {
        // Создаём "гибкий" профиль (обычный класс)
        FlexibleUser flexible = new FlexibleUser("Иван", 30);
        System.out.println("Гибкий профиль (до изменений): " + flexible);

        // Меняем имя и возраст с помощью сеттеров
        flexible.setName("Пётр");
        flexible.setAge(25);
        System.out.println("Гибкий профиль (после изменений): " + flexible);

        // Создаём "фиксированный" профиль (record)
        FixedUser fixed = new FixedUser("Анна", 28);
        System.out.println("Фиксированный профиль (record): " + fixed);

//        fixed.setName("Мария");   // Ошибка компиляции: у record нет сеттера setName
//        fixed.age = 29;           // Ошибка компиляции: поле age недоступно и final
//        fixed.name("Мария");      // Ошибка компиляции: метод name() — геттер без параметров
    }
}