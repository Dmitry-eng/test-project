package org.example;

public class Person {
    String name;

    int age;

    String address;

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("123");
        }
        this.name = name;
    }
}
