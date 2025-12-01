package ru.javarush.java.core.level61.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Читаем команду из консоли
        System.out.print("Введите команду для запуска внешнего процесса: ");
        String command = new Scanner(System.in).nextLine();

        // Запускаем процесс (Unix-подобные системы)
        var process = new ProcessBuilder("sh", "-c", command)
                .redirectErrorStream(false)
                .start();

        // Хелпер для запуска потоков чтения


        // Запускаем отдельные потоки


        // Ждём завершения процесса


        // Ждём завершения потоков чтения


        System.out.println("Процесс завершён с кодом: " + exitCode);
    }

    private static void readStream(java.io.InputStream in, String prefix) {
        try (var reader = new BufferedReader(new InputStreamReader(in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(prefix + " " + line);
            }
        } catch (Exception e) {
            System.err.println("Ошибка чтения " + prefix + ": " + e.getMessage());
        }
    }
}