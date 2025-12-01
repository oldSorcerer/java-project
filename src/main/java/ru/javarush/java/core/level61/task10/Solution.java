package ru.javarush.java.core.level61.task10;

import java.io.BufferedReader;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Запускаем отдельный Java-процесс (NoisyProcess), который пишет в stdout и stderr
        boolean isWindows = System.getProperty("os.name").toLowerCase().contains("win");
        String javaCmd = Paths.get(System.getProperty("java.home"), "bin", isWindows ? "java.exe" : "java").toString();
        String classpath = System.getProperty("java.class.path");

        var process = new ProcessBuilder(javaCmd, "-cp", classpath, "NoisyProcess")
                .redirectErrorStream(false) // оставляем потоки раздельными
                .start();


        // Читаем stdout и stderr параллельно

    }

    private static Thread startReaderThread(BufferedReader reader, String label) {
        return new Thread(() -> {
            try (reader) {
                reader.lines().forEach(line -> System.out.println("[" + label + "] " + line));
            } catch (Exception e) {
                System.out.println("[" + label + "] Ошибка: " + e.getMessage());
            }
        }, "reader-" + label);
    }
}