package lab10_2;

import lab10_1.MyDate;

public class Employee implements Comparable<Employee> {

    private static int counter = 0;

    private final int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private MyDate birthDate;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate) {
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
        return "Employee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        // Vezetéknév és Keresztnév szerint lexikografikus sorrendben
        return 0;
    }
}
