package ru.javarush.java.core.level63.task08;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        // Работаем чуть дольше, чем длится запись JFR (30с), чтобы запись точно завершилась
        long end = System.currentTimeMillis() + 35_000;

        // Список "долго живущих" объектов — он держит часть кучи занятаой,
        // чтобы чаще происходили сборки мусора при создании временных объектов
        java.util.List<byte[]> keep = new java.util.ArrayList<>();

        // Параметры нагрузки (подобраны так, чтобы на -Xmx128m стабильно были GC-события)
        final int KEEP_COUNT = 32;   // ~32 МБ живых данных
        final int BURST_COUNT = 80;  // ~80 МБ временных объектов за итерацию
        final int BLOCK = 1_000_000; // ~1 МБ на блок

        while (System.currentTimeMillis() < end) {
            // Временные объекты, которые вскоре станут мусором (заполняем молодое поколение)
            java.util.List<byte[]> trash = new java.util.ArrayList<>(BURST_COUNT);
            for (int i = 0; i < BURST_COUNT; i++) {
                byte[] buf = new byte[BLOCK];
                trash.add(buf); // удерживаем до конца итерации, чтобы точно занять память

                // Часть объектов оставляем жить дольше, чтобы держать постоянную нагрузку на кучу
                if (keep.size() < KEEP_COUNT) {
                    keep.add(new byte[BLOCK]);
                }
            }

            // Сбрасываем ссылки на временные объекты — появляется много мусора => GC
            trash.clear();

            // Небольшая пауза: даём сборщику мусора время "сработать"
            Thread.sleep(5);
        }

        // Выводим сообщение, чтобы показать, что программа завершилась
        System.out.println("Тестовая нагрузка завершена. Проверьте файл записи test.jfr.");
    }
}