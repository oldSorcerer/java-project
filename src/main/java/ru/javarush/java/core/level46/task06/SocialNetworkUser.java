package ru.javarush.java.core.level46.task06;

import com.google.gson.annotations.Expose;

public class SocialNetworkUser {


    private String userFirstName;


    private int userAge;

    // ВАЖНО: без @Expose — поле не попадёт в публичный JSON
    private boolean isEmployed;

    public SocialNetworkUser(String userFirstName, int userAge, boolean isEmployed) {
        this.userFirstName = userFirstName;
        this.userAge = userAge;
        this.isEmployed = isEmployed;
    }
}