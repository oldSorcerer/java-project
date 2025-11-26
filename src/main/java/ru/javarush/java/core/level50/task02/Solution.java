package ru.javarush.java.core.level50.task02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем UI в потоке обработки событий Swing (EDT)
        SwingUtilities.invokeLater(() -> {
            // Главное окно приложения
            JFrame frame = new JFrame("Командный пункт запуска ракеты");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Большая кнопка "Инициировать Запуск"
            OrderedButton launchButton = new OrderedButton("Инициировать Запуск");
            launchButton.setFont(launchButton.getFont().deriveFont(Font.BOLD, 20f)); // делаем кнопку визуально выразительнее

            // Два отдельных "агента уведомлений" (ActionListener)


            // Добавляем слушателей в строгом порядке — сначала Топливная, затем Навигационная


            // Размещаем кнопку в центре окна
            frame.add(launchButton, BorderLayout.CENTER);

            frame.setSize(500, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    // Кнопка, гарантирующая вызов слушателей действий в порядке их добавления.
    // В Swing по умолчанию ActionListener-ы могут вызываться в обратном порядке,
    // поэтому переопределяем fireActionPerformed и уведомляем слушателей сами — в нужной последовательности.
    static class OrderedButton extends JButton {
        private final List<ActionListener> orderedListeners = new ArrayList<>();

        public OrderedButton(String text) {
            super(text);
        }

        @Override
        public void addActionListener(ActionListener l) {
            super.addActionListener(l);      // сохраняем стандартное поведение и совместимость
            orderedListeners.add(l);         // дополнительно запоминаем порядок добавления
        }

        @Override
        protected void fireActionPerformed(ActionEvent event) {
            // Уведомляем слушателей ровно в том порядке, в котором они были добавлены
            for (ActionListener l : orderedListeners) {
                l.actionPerformed(event);
            }
        }
    }
}