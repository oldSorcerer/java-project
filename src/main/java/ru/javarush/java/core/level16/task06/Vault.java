package ru.javarush.java.core.level16.task06;

public class Vault {
    // Приватное статическое поле — общий уровень безопасности для всего хранилища
    private static int securityLevel = 100;

    // Публичный статический вложенный класс — не требует объекта Vault для создания
    public static class SecurityDisplayUnit {

        public void showSecurityLevel() {
            System.out.println(securityLevel);
        }
    }

    public static void main(String[] args) {
        // Создаем объект вложенного класса без создания объекта Vault
        SecurityDisplayUnit display = new SecurityDisplayUnit();
        // Показываем текущий уровень безопасности
        display.showSecurityLevel();
    }
}