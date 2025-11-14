package ru.javarush.java.core.level15.task07.main;

public class ModuleMain {
    public static void main(String[] args) {
        // Классы в одном пакете имеют доступ к package-private методам
        ModuleHelper moduleHelper = new ModuleHelper();
        moduleHelper.provideInternalAssistance();
    }
}