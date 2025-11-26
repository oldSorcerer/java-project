package ru.javarush.java.core.level50.task03;

import javax.swing.*;

public class Solution {
    public static void main(String[] args) {
        // Создаем UI на Event Dispatch Thread — это поток для всех операций с Swing
        SwingUtilities.invokeLater(() -> {
            // Основное окно управления
            JFrame frame = new JFrame("Умный дом");
            // При закрытии окна завершаем приложение целиком
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Одна демонстрационная кнопка с приветствием
            JButton helloButton = 
            // Добавляем кнопку в центр (BorderLayout по умолчанию)
            frame.getContentPane().add(helloButton);

            frame.pack();                 // Подгоняем размер под содержимое
            frame.setLocationRelativeTo(null); // Центрируем окно на экране
            frame.setVisible(true);       // Показываем окно
        });
    }
}