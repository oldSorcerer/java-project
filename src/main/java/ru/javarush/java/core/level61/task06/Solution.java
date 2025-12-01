package ru.javarush.java.core.level61.task06;

import java.util.concurrent.TimeUnit;

public class Solution {
    public static void main(String[] args) throws Exception {
        boolean isWindows = System.getProperty("os.name").toLowerCase().contains("win");

        String[] command = isWindows
                ? new String[]{"ping", "google.com"}
                : new String[]{"ping", "-c", "5", "google.com"};

        
    }
}