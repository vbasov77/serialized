package org.example;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Виталий");
        System.out.println(person);

        Foo foo = new Foo();
        Path path = foo.serialized(person);
        foo.deserialized(path);
    }
}