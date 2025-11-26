package ru.javarush.java.core.level51.task06;

public class Solution {

    // "Основной" сотрудник: имитирует длительную подготовку
    static class MainWorker implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + ": начинаю длительную подготовку...");
                // Имитация долгой работы (заметное время)
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + ": подготовка завершена.");
            } catch (InterruptedException e) {
                // В учебной задаче просто сообщаем о прерывании
                System.out.println(Thread.currentThread().getName() + ": прерван во время подготовки.");
            }
        }
    }

    // "Помощник": ждёт завершения MainWorker с помощью join
    static class AssistantWorker implements Runnable {
        private final Thread mainWorkerThread;

        public AssistantWorker(Thread mainWorkerThread) {

        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": готов начать, но сначала дождусь MainWorker...");
            try {
                // Ключевой момент: помощник приостанавливается и ждёт завершения MainWorker
                // В это время его состояние будет WAITING (ожидание без таймаута)
                
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + ": прерван во время ожидания.");
                return; // Корректно завершаем поток при прерывании
            }
            // Продолжаем работу после завершения MainWorker
            System.out.println(Thread.currentThread().getName() + ": дождался! Выполняю свою работу и завершаюсь.");
        }
    }

    public static void main(String[] args) throws Exception {


        // Параллельный запуск потоков: сначала запускаем MainWorker,
        // чтобы join у AssistantWorker точно видел "живой" поток и вошёл в ожидание


        // Через короткое время проверяем состояние AssistantWorker
        // Ожидаем, что он уже перешёл в состояние WAITING благодаря join()
        Thread.sleep(200);
        System.out.println("Состояние AssistantWorker через короткое время: " + assistant.getState());

        // Дожидаемся корректного завершения обоих потоков


        System.out.println("Оба сотрудника завершили работу.");
    }
}