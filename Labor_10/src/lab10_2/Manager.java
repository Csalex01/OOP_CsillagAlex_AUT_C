package lab10_2;

import lab10_1.MyDate;

public class Manager extends Employee  implements Comparable<Employee>{

    private String department;

    public Manager(String firstName, String lastName, double salary, MyDate birthDate, String department) {
        super(firstName, lastName, salary, birthDate);
        this.department = department;
    }

    @Override
    public int compareTo(Employee o) {
        // Vezetéknév és Keresztnév szerint lexikografikus sorrendben
        return 0;
    }
}
