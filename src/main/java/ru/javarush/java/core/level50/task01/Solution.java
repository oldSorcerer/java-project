package ru.javarush.java.core.level50.task01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solution {
    public static void main(String[] args) {
        // Создаем экземпляр обработчика команд звездолета
        StarshipCommandProcessor processor = new StarshipCommandProcessor();

        // Ручной вызов метода actionPerformed с передачей null
        processor.actionPerformed(null);
    }
}