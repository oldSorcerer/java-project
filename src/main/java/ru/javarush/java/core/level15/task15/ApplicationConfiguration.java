package ru.javarush.java.core.level15.task15;

public class ApplicationConfiguration {
    public static final String APPLICATION_DEFAULT_LANGUAGE ;

    static {
        String envLang = System.getenv("APP_LANG");
        if (envLang != null) {
            APPLICATION_DEFAULT_LANGUAGE = envLang;
        } else {
            APPLICATION_DEFAULT_LANGUAGE = "en";
        }
    }
}
