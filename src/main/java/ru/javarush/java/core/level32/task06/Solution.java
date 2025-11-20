package ru.javarush.java.core.level32.task06;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Три набора артефактов с пересечениями
        Set<Integer> siteOneArtifacts = Set.of(101, 102, 103, 110, 120);
        Set<Integer> siteTwoArtifacts = Set.of(103, 104, 105, 120, 130);
        Set<Integer> siteThreeArtifacts = Set.of(105, 106, 107, 130, 140);

        // Объединение всех артефактов из трёх множеств.
        // Stream.of(...) собирает три множества в поток, flatMap "расплющивает" их в один поток ID,
        // затем Collectors.toCollection(TreeSet::new) — собираем в отсортированное множество для наглядного вывода.


        // Артефакты, встречающиеся строго на одном участке:
        // 1) "Плоский" поток всех ID из трёх множеств
        // 2) Группируем по ID и считаем, сколько раз он встретился среди трёх множеств (counting)
        // 3) Оставляем те, у кого счётчик ровно 1 (т.е. встречается только в одном множестве)
        // 4) Собираем ключи (ID) в отсортированное множество


        // Вывод результатов
        System.out.println("allUniqueArtifacts: " + allUniqueArtifacts);
        System.out.println("exclusiveSiteFinds: " + exclusiveSiteFinds);
    }
}