package ru.javarush.java.core.level24.task15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {



            // Пытаемся открыть файл — здесь может возникнуть FileNotFoundException


            // Лёгкая проверка доступа: читаем первый байт (может вернуть -1, если файл пуст)

            // Намеренно провоцируем более общую ошибку ввода-вывода



            // Важно: этот catch идёт ПЕРЕД IOException, иначе код не скомпилируется

            // Обработка всех прочих ошибок ввода-вывода


    }
}