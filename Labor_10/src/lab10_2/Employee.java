package lab10_2;

import lab10_1.MyDate;

public class Employee implements Comparable<Employee> {

    private static int counter = 0;

    private final int ID;
    private String firstName;
    private final String lastName;
    private double salary;
    private final MyDate birthDate;

    public Employee(String firstName,
                    String lastName,
                    double salary,
                    MyDate birthDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;

        this.ID = Employee.counter;

        Employee.counter++;
    }

    // GETTER Methods

    public int getID() {
        return this.ID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getSalary() {
        return this.salary;
    }

    public MyDate getBirthDate() {
        return this.birthDate;
    }

    // SETTER Methods

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // OTHER Methods

    @Override
    public String toString() {

        StringBuilder buffer = new StringBuilder();

        buffer.append(this.ID).append(" ");

        if(this instanceof Manager) {
            buffer.append("(MANAGER)\n");
        } else {
            buffer.append("(EMPLOYEE)\n");
        }

        buffer.append("\tFirst Name: ").append(this.firstName).append("\n")
                .append("\tLast Name: ").append(this.lastName).append("\n")
                .append("\tSalary: ").append(this.salary).append("\n")
                .append("\tBirth Date: ")
                .append(this.birthDate.getYear()).append(".")
                .append(this.birthDate.getMonth()).append(".")
                .append(this.birthDate.getDay())
                .append("\n----------\n");

        return buffer.toString();
    }

    @Override
    public int compareTo(Employee o) {
        String thisName = this.lastName + this.firstName;
        String oName = o.lastName + o.firstName;

        return thisName.compareTo(oName);
    }
}
