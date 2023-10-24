package pl.sda.mg.reflection;

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private void sayHello(String name, LocalDate date) {
        System.out.println("Hello " + name + "!" + date);
    }

    private void sayHello2() {
        System.out.println("Hello2 from reflection");
    }
}
