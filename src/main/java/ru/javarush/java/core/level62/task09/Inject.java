package ru.javarush.java.core.level62.task09;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Аннотация для пометки полей, в которые нужно "внедрить" зависимость
@Retention(RetentionPolicy.RUNTIME) // Должна быть доступна во время выполнения для рефлексии
@Target(ElementType.FIELD)          // Применяется к полям
public @interface Inject {
}