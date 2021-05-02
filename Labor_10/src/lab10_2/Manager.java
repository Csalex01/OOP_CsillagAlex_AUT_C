package lab10_2;

import lab10_1.MyDate;

public class Manager extends Employee {

    private String department;

    public Manager(String firstName,
                   String lastName,
                   double salary,
                   MyDate birthDate,
                   String department) {

        super(firstName, lastName, salary, birthDate);
        this.department = department;
    }

    // GETTER Methods

    public String getDepartment() {
        return this.department;
    }

    // SETTER Methods

    public void setDepartment(String department) {
        this.department = department;
    }
}
