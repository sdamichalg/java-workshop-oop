package pl.sda.mg.oop.composition;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getAddress().getZipCode();
    }
}
