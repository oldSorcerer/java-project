package ru.javarush.java.core.level50.task10;

import javax.swing.*;
import java.awt.*;

public class Solution {
    private final JLabel statusLabel = new JLabel("Ожидание команды", SwingConstants.CENTER);
    private final JButton fireButton = new JButton("Огонь!");

    private void createAndShowUI() {
        // Создаем окно и базовую разметку
        JFrame frame = new JFrame("Отзывчивый пульт управления лазером");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(statusLabel, BorderLayout.CENTER);
        frame.add(fireButton, BorderLayout.SOUTH);

        // Обработчик кнопки "Огонь!"
        fireButton.addActionListener(e -> {
            // Обработчик вызывается в EDT — здесь нельзя делать долгие операции.
            // Поэтому запускаем имитацию долгой работы в отдельном потоке.
            Thread worker = new Thread(() -> {
                try {
                    // Имитация "зарядки" лазера (долгая операция)
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    // В учебной задаче достаточно корректно прервать поток
                    Thread.currentThread().interrupt();
                }

                // Безопасное обновление UI строго в EDT
                SwingUtilities.invokeLater(() -> ... );
            }, "laser-charger");
            worker.start();
        });

        frame.setSize(380, 180);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Создаем UI в EDT — это правильный поток для работы со Swing

    }
}