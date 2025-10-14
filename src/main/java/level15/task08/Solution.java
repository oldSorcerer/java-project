package ru.javarush.java.core.level15.task08;

// Класс Solution находится в том же пакете (default package), что и DigitalLibraryManager
public class Solution {
    public static void main(String[] args) {
        // Создаем объект управляющего цифровой библиотекой
        DigitalLibraryManager manager = new DigitalLibraryManager();

        // Вызов public-метода — доступен всем
        manager.announceOpening();

        // Вызов protected-метода — доступен в том же пакете (и в подклассах)
        manager.conductStaffMeeting();

        // Вызов package-private метода — доступен в том же пакете
        manager.manageBookInventory();

        // Попытка вызова private-метода приведет к ошибке компиляции,
        manager.handleFinancialAudits();
    }
}