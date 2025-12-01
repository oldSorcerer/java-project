package ru.javarush.java.core.level61.task08;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Запускаем внешний процесс (EchoProcess в отдельной JVM)
        String cp = System.getProperty("java.class.path");
        var process = new ProcessBuilder("java", "-cp", cp, "EchoProcess")
                .redirectErrorStream(true)
                .start();


    }
}