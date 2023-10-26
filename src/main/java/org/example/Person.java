package org.example;

public class Person {
    String name;

    int age;

    String address;

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
}
