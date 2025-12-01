package ru.javarush.java.core.level61.task02;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Определяем команду в зависимости от ОС
        String os = System.getProperty("os.name").toLowerCase();
        ProcessBuilder pb = os.contains("win")
                ? new ProcessBuilder("cmd.exe", "/c", "dir")   // В Windows dir через cmd.exe
                : new ProcessBuilder("ls", "-l");              // В Unix — стандартный ls -l



        // Запускаем процесс


        // Быстро копируем вывод процесса прямо в stdout


        // Дожидаемся завершения

    }
}