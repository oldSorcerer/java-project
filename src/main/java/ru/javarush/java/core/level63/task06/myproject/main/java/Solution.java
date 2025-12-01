import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    // Логгер SLF4J — фактически будет работать через Logback (см. logback.xml)
    private static final Logger log = LoggerFactory.getLogger(Solution.class);

    public static void main(String[] args) throws InterruptedException {
        // Создаем пул из 3 потоков и ставим в очередь 6 "запросов"
        int tasks = 6;
        int poolSize = 3;

        ExecutorService executor = Executors.newFixedThreadPool(poolSize);
        CountDownLatch done = new CountDownLatch(tasks); // Ждем завершения всех задач

        for (int i = 1; i <= tasks; i++) {
            int taskNo = i; // локальная копия номера задачи для читаемых логов

            executor.submit(() -> {
                // Генерируем уникальный идентификатор запроса
                String requestId = UUID.randomUUID().toString();

                // Кладем его в MDC — потоковый контекст логирования.
                // Все логи из этого потока автоматически получат поле requestId (см. logback.xml)


                try {
                    log.info("Начало обработки запроса №{}", taskNo);

                    // Имитация работы: случайные паузы и промежуточные шаги
                    Thread.sleep(100 + ThreadLocalRandom.current().nextInt(400));
                    log.info("Промежуточный шаг обработки запроса №{}", taskNo);
                    Thread.sleep(100 + ThreadLocalRandom.current().nextInt(400));

                    log.info("Завершение обработки запроса №{}", taskNo);
                } catch (InterruptedException e) {
                    // Корректно отмечаем прерывание потока и логируем событие
                    Thread.currentThread().interrupt();
                    log.warn("Запрос №{} был прерван", taskNo);
                } finally {
                    // ВАЖНО: очищаем MDC, чтобы данные не "протекали" при переиспользовании потоков пула

                    done.countDown();
                }
            });
        }

        // Дожидаемся завершения всех задач и аккуратно останавливаем пул
        done.await();
        executor.shutdown();

        // Лог от главного потока — без requestId, что тоже ожидаемо
        log.info("Все запросы обработаны");
    }
}