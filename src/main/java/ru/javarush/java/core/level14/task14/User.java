package ru.javarush.java.core.level14.task14;

public class User {
    String userName;
    int userAge;

    public User() {
        userName = "Unknown";
        userAge = 0;
    }

    public User(String userName) {
        this.userName = userName;
        this.userAge = 0;
    }
}
