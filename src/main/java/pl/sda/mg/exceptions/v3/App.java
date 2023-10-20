package pl.sda.mg.exceptions.v3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

//        employeeService.printEmployeeDetails(getEmployees(), 6); // obsługa wyjątku
        employeeService.calculateRetirementYear(getEmployees()); //obsługa wyjątku
        employeeService.calculateRetirementYear2(getEmployees()); //obsługa wyjątku


    }

    private static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setFirstName("Jan");
        employee1.setLastName("Kowalski");
        employee1.setAge(52);
        employee1.setSex("M");

        employee2.setFirstName("Adam");
        employee2.setLastName("Nowak");
        employee2.setAge(31);
        employee2.setSex("M");

        employee3.setFirstName("Anna");
        employee3.setLastName("Krawczyk");
        employee3.setAge(31);
        employee3.setSex("W");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(null);

        return employees;
    }
}
