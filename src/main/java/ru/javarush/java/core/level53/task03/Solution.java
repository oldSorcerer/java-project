package ru.javarush.java.core.level53.task03;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Изначально право пройти у Алисы
        Corridor corridor = new Corridor("Алиса");

        Thread alice = new Thread(new Alice(corridor), "Алиса");
        Thread bob = new Thread(new Bob(corridor), "Боб");

        // Запускаем оба "пешехода"
        alice.start();
        bob.start();

        // Потоки намеренно никогда не завершаются — демонстрация livelock.
        alice.join();
        bob.join();
    }
}

// Общий "коридор" — разделяемый объект для координации действий
class Corridor {
    // volatile гарантирует видимость изменений между потоками
    volatile String priority;    // у кого "право пройти" прямо сейчас: "Алиса" или "Боб"
    volatile boolean aliceDone;  // флаг "Алиса прошла" (в этой задаче всегда false)
    volatile boolean bobDone;    // флаг "Боб прошёл" (в этой задаче всегда false)

    Corridor(String first) {
        this.priority = first;
    }
}