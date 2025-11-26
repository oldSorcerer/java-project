package ru.javarush.java.core.level50.task09;

import javax.swing.*;

// Простейшее Swing-приложение, намеренно "ломающее" UI долгой операцией в обработчике кнопки
public class Solution extends JFrame {

    private final JLabel statusLabel = new JLabel("Ожидание команды", SwingConstants.CENTER);

    public Solution() {
        super("Зависающий пульт управления лазером");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton fireButton = new JButton("Огонь!");

        // Простейший макет: метка по центру, кнопка снизу
        setLayout(new java.awt.BorderLayout(10, 10));
        add(statusLabel, java.awt.BorderLayout.CENTER);
        add(fireButton, java.awt.BorderLayout.SOUTH);

        // Обработчик выполняется в EDT. Здесь мы намеренно вызываем Thread.sleep,
        // что "замораживает" интерфейс на 3 секунды — демонстрация плохой практики.

            try {
                Thread.sleep(3000); // имитация долгой зарядки лазера (блокирует UI)
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt(); // корректно восстанавливаем флаг прерывания
            }
            // После "зарядки" меняем текст метки



        setSize(360, 160);
        setLocationRelativeTo(null); // центрируем окно
        setVisible(true);
    }

    public static void main(String[] args) {
        // Создаём окно в EDT (это правильно), но долгую работу запустим прямо в обработчике (это и есть демонстрация проблемы)

    }
}