package ru.javarush.java.core.level15.task17;

public class ApplicationModule {

    private static String moduleStatusMessage;

    static {
        moduleStatusMessage = "Приложение: Главный модуль готов к работе!";
        System.out.println(moduleStatusMessage);
    }
}
