package ru.javarush.java.core.level64.task07;

public class Solution {
    public static void main(String[] args) throws Exception {
        long pid = ProcessHandle.current().pid();
        System.out.println("Running... PID=" + pid);

        // Пример команды jmap для снятия полного дампа памяти текущего процесса:
        // jmap -dump:format=b,file=heap.bin <PID>
        // где <PID> — это идентификатор процесса (например, " + pid + ").

        // Держим процесс «живым», чтобы jmap мог к нему подключиться.
        // Ждём бесконечно с минимальной нагрузкой на CPU.
        Object lock = new Object();
        synchronized (lock) {
            lock.wait(); // Ждём, пока нас не завершат извне (kill/CTRL+C)
        }
    }
}