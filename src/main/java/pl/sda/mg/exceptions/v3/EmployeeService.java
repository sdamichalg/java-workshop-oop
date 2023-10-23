package pl.sda.mg.exceptions.v3;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public void printEmployeeDetails(List<Employee> employeeList, int indexToFetch) {
        Employee employeeByIndex = employeeList.get(indexToFetch);
        System.out.println(employeeByIndex);
    }

    public List<Employee> fetchEmployeeByLastName(List<Employee> list, String lastName) {
        //pobrać z db
        List<Employee> employees = list.stream()
                .filter(em -> lastName.equalsIgnoreCase(em.getLastName()))
                .collect(Collectors.toList());

        if (employees.isEmpty()) {
//            throw new RuntimeException("Brak pracownika o nazwisku: " + lastName);
            throw new NoSuchEmployeeException("Brak pracownika o nazwisku: " + lastName);
        }
        return employees;

    }

    public void calculateRetirementYear(List<Employee> employeeList) {
        LocalDate currentDate = LocalDate.now();

        employeeList.stream()
                .forEach(employee -> {
                    try {
                        int retirementAge = ("W".equalsIgnoreCase(employee.getSex())) ? 60 : 65;
                        int retirementYear = currentDate.getYear() - employee.getAge() + retirementAge;

                        System.out.printf("Rok przejścia na emeryturę dla pracownika %s %s to rok: %d\n",
                                employee.getFirstName(), employee.getLastName(), retirementYear);

                    } catch (NullPointerException ex) {
                        System.out.println("NPE: brak danych");
                    } catch (Exception e) {
                        System.out.println("Nieznany wyjątek");
                        e.printStackTrace();
                    }
                });
    }

    public void calculateRetirementYear2(List<Employee> employeeList) {
        LocalDate currentDate = LocalDate.now();

        try {
            employeeList.stream()
                    .forEach(employee -> {

                        int retirementAge = ("W".equalsIgnoreCase(employee.getSex())) ? 60 : 65;
                        int retirementYear = currentDate.getYear() - employee.getAge() + retirementAge;

                        System.out.printf("Rok przejścia na emeryturę dla pracownika %s %s to rok: %d\n",
                                employee.getFirstName(), employee.getLastName(), retirementYear);

                    });
        } catch (NullPointerException ex) {
            System.out.println("NPE: brak danych");
        }
    }
}

