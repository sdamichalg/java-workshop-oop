package pl.sda.mg.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("Jan Kowalski", 20);

        //serializacja
        try (FileOutputStream fileOutputStream = new FileOutputStream("person");
             ObjectOutputStream
                     objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(student);
            System.out.println("Obiekt został zserializowany do pliku.");
        }

        //deserializacja
        try (FileInputStream fileInputStream = new FileInputStream("person");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Student readStudent = (Student) objectInputStream.readObject();

            System.out.println("Obiekt odtworzony z pliku: " + readStudent);

        }
    }
}
