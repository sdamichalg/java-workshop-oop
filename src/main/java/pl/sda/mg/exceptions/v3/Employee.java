package pl.sda.mg.exceptions.v3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;

}
