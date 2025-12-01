package ru.javarush.java.core.level61.task08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EchoProcess {
    public static void main(String[] args) throws Exception {
        // Читаем stdin и отвечаем в stdout
        // Печатаем "Echo: <строка>", пока не придёт "exit"
        try (var in = new BufferedReader(new InputStreamReader(System.in));
             var out = new PrintWriter(System.out, true)) {
            String line;
            while ((line = in.readLine()) != null) {
                if ("exit".equals(line)) break;
                out.println("Echo: " + line);
            }
        }
    }
}