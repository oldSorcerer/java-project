package ru.javarush.java.core.level53.task10;

public class SecretRoomAccess {
    // Отдельный объект-блокировка — только один поток сможет войти в синхронизированный блок одновременно
    private final Object lock = new Object();

    // Метод, требующий эксклюзивного доступа
    public void accessRoom() {


        
    }

    // Небольшая демонстрация работы: несколько потоков по очереди получают доступ
    public static void main(String[] args) throws InterruptedException {
        SecretRoomAccess room = new SecretRoomAccess();

        Thread t1 = new Thread(room::accessRoom, "Алиса");
        Thread t2 = new Thread(room::accessRoom, "Боб");
        Thread t3 = new Thread(room::accessRoom, "Чарли");

        t1.start();
        t2.start();
        t3.start();

        // Ждем завершения всех потоков, чтобы демонстрация корректно завершилась
        t1.join();
        t2.join();
        t3.join();
    }
}