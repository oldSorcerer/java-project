package ru.javarush.java.core.level63.task05;

import java.util.logging.Logger;

public class Solution {
    // Инициализация потокобезопасного логгера из стандартного API java.util.logging


    public static void main(String[] args) throws InterruptedException {
        // Создаем первый поток для имитации действий Player1

        // Создаем второй поток для имитации действий Player2


        // Запускаем оба потока почти одновременно, чтобы они писали в лог параллельно


        // Ожидаем завершения работы обоих потоков, чтобы программа не завершилась раньше

    }

    // Вложенный класс, реализующий Runnable, для логирования действий одного игрока
    private static class PlayerActionLogger implements Runnable {
        private final String playerName;

        public PlayerActionLogger(String playerName) {
            this.playerName = playerName;
        }

        @Override
        public void run() {
            // Каждый поток генерирует и логирует ровно три уникальных сообщения
            for (int i = 1; i <= 3; i++) {
                // Потокобезопасный вызов logger.info — сообщение выводится целиком
                
                try {
                    // Небольшая пауза для эмуляции реальной нагрузки и гарантии пересечения выполнения потоков
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // В случае прерывания восстановим статус прерывания у текущего потока
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}