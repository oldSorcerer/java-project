package ru.javarush.java.core.level35.task08;

import java.io.FileWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        System.out.println("Выберите режим работы (append/overwrite):");
        String mode = console.nextLine().trim().toLowerCase();

        System.out.println("Введите текст настроек:");
        String settings = console.nextLine();

        // Если пользователь ввёл "append" — будем дозаписывать в конец файла,
        // любой другой ввод трактуем как "overwrite" (перезапись).


        // FileWriter с флагом append управляет режимом записи:
        // append = true  -> дозапись в конец (сохраняем старое содержимое);
        // append = false -> перезапись (очищаем файл и пишем только новые данные).

    }
}