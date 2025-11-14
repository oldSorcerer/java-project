package ru.javarush.java.core.level15.task08;

public class DigitalLibraryManager {
    public void announceOpening() {
        System.out.println("Библиотека открыта для посетителей!");
    }

    protected void conductStaffMeeting() {
        System.out.println( "Проведено собрание персонала библиотеки.");
    }

    void manageBookInventory() {
        System.out.println("Инвентаризация книг завершена.");
    }

    private void handleFinancialAudits() {
        System.out.println( "Финансовый аудит успешно завершен.");
    }
}
