package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String name = "Yuliia";
        String lastName = "Duliepova";

        Person person = new Person(name, lastName);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        gson.fromJson()

        System.out.println(json);
    }
}