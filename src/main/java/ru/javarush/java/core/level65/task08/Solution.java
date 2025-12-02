package ru.javarush.java.core.level65.task08;

public class Solution {
    public static void main(String[] args) {
        // Строим выражение: 7 + (10 - 3)
        Expr expression = new PlusExpr(
                new NumberExpr(7),
                new MinusExpr(new NumberExpr(10), new NumberExpr(3))
        );

        // Вычисляем и печатаем результат
        int result = eval(expression);
        System.out.println(result); // Ожидается 14
    }

    // Рекурсивный вычислитель выражений.
    // Используем switch с record patterns для сопоставления и распаковки компонент записей.
    static int eval(Expr expressionToEvaluate) {


        
    }
}

// Запечатанный интерфейс — корень иерархии выражений.
// Разрешаем только три конкретных типа-потомка.
sealed interface Expr permits NumberExpr, PlusExpr, MinusExpr {}

// Конкретные типы выражений реализованы как record-классы.
record NumberExpr(int value) implements Expr {}
record PlusExpr(Expr left, Expr right) implements Expr {}
record MinusExpr(Expr left, Expr right) implements Expr {}