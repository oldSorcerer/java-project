package ru.javarush.java.core.level50.task04;

import javax.swing.*;

public class Solution {
    public static void main(String[] args) {
        // Запускаем создание и показ окна в потоке событий (EDT),
        // чтобы соблюсти потокобезопасность Swing

    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Умный дом"); // Создаем окно
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Закрытие приложения при закрытии окна

        JButton activateButton = new JButton("Активировать Термостат"); // Кнопка с нужным текстом

        // Обработчик события нажатия на кнопку (ActionListener)


        frame.getContentPane().add(activateButton); // Добавляем кнопку в центр окна
        frame.pack(); // Подбираем минимальный размер, достаточный для содержимого
        frame.setLocationRelativeTo(null); // Центрируем окно на экране
        frame.setVisible(true); // Показываем окно
    }
}