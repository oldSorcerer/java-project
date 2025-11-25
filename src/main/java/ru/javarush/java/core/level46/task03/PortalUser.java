package ru.javarush.java.core.level46.task03;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

// Класс для управления учетными записями пользователей портала
public class PortalUser {
    // Переименовываем поле username в "login" при сериализации в JSON

    private String username;
    
    // Исключаем поле password из итогового JSON

    private String password;
    
    // Возраст пользователя
    private int age;
    
    // Пустой конструктор (Jackson требует его для десериализации)
    public PortalUser() {
    }

    // Геттер для поля username
    public String getUsername() {
        return username;
    }

    // Сеттер для поля username
    public void setUsername(String username) {
        this.username = username;
    }

    // Геттер для поля password
    public String getPassword() {
        return password;
    }

    // Сеттер для поля password
    public void setPassword(String password) {
        this.password = password;
    }

    // Геттер для поля age
    public int getAge() {
        return age;
    }

    // Сеттер для поля age
    public void setAge(int age) {
        this.age = age;
    }
}