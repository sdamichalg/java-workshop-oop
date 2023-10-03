package pl.sda.mg.oop.composition;

public class Employee {
    String name;
    String pesel;
    Salary salary;
    Address address;

    private Salary getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }
}
