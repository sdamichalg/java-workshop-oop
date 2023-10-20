package pl.sda.mg.exceptions.v3;

import java.time.LocalDate;
import java.util.List;

public class EmployeeService {

    public void printEmployeeDetails(List<Employee> employeeList, int indexToFetch) {
        Employee employeeByIndex = employeeList.get(indexToFetch);
        System.out.println(employeeByIndex);
    }

    public void calculateRetirementYear(List<Employee> employeeList) {
        LocalDate currentDate = LocalDate.now();

        employeeList.stream()
                .forEach(employee -> {
                    int retirementAge = ("W".equalsIgnoreCase(employee.getSex())) ? 60 : 65;
                    int retirementYear = currentDate.getYear() - employee.getAge() + retirementAge;

                    System.out.printf("Rok przejścia na emeryturę dla pracownika %s %s to rok: %d",
                            employee.getFirstName(), employee.getLastName(), retirementYear);
                });
    }
}
