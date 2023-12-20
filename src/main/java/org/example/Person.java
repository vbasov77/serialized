package org.example;

import java.io.Serializable;

public record Person(String name) implements Serializable {

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
