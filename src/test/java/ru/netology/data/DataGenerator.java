package ru.netology.data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {
    public DataGenerator() {
    }

    public static UserInfo generateUserInfo() {
        String login = "vasya";
        String password = "qwerty";
        return new UserInfo("vasya", "qwerty");
    }

    public static UserInfo getInvalidUserInfo() {
        Faker faker = new Faker(new Locale("en"));
        String login = faker.name().username();
        String password = faker.internet().password();
        return new UserInfo(login, password);

    }
}
