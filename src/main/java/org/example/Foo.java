package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

public class Foo {
    public Path serialized(Object ob) throws IOException {
        Path filePath = Path.of(ob.getClass() + "_" + UUID.randomUUID().toString() + ".txt");
        OutputStream outputStream = Files.newOutputStream(Path.of(String.valueOf(filePath)));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(ob);
        objectOutputStream.close();
        return filePath;
    }

    public void deserialized(Path path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path));
        Object deserialized = objectInputStream.readObject();
        System.out.println(deserialized);
    }

}
