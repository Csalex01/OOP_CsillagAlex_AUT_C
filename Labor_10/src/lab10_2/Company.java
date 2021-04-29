package lab10_2;

import java.io.PrintStream;
import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
    }

    // GETTER Methods

    public String getName() {
        return this.name;
    }

    // SETTER Methods

    public void setName(String name) {
        this.name = name;
    }

    // OTHER Methods

    public void hire(Employee employee) {
        this.employees.add(employee);
    }

    public void hireAll(String fileName) {
        // TODO: implement hireAll method
        // Reads employees from file
    }

    public void fire(int employeeID) {
        this.employees.remove(employeeID);
    }

    public void printAll(PrintStream ps) {
        for(Employee employee : this.employees) {
            ps.println(employee);
        }
    }

    public void printManagers(PrintStream ps) {
        for(Employee employee : this.employees) {
            if(employee instanceof Manager)
                ps.println(employee);
        }
    }

}
