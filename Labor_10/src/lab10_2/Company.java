package lab10_2;

import lab10_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private final ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
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
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (scanner == null) {
            System.out.println("Error while opening file: " + fileName);
            return;
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] fields = line.split(", ");

            Employee employee;

            boolean manager = false;

            try {

                if(fields[6] != null)
                    manager = true;

            } catch (IndexOutOfBoundsException ignored) {}

            if (manager) {
                employee = new Manager(
                        fields[1],
                        fields[0],
                        Double.parseDouble(fields[2]),
                        new MyDate (
                                Integer.parseInt(fields[3]),
                                Integer.parseInt(fields[4]),
                                Integer.parseInt(fields[5])
                        ),
                        fields[6]);
            } else {
                employee = new Employee (
                        fields[1],
                        fields[0],
                        Double.parseDouble(fields[2]),
                        new MyDate (
                                Integer.parseInt(fields[3]),
                                Integer.parseInt(fields[4]),
                                Integer.parseInt(fields[5])
                        )
                );
            }

            this.hire(employee);

        }
    }

    public void fire(int employeeID) {
        this.employees.remove(employeeID);
    }

    public void printAll(PrintStream ps) {
        for (Employee employee : this.employees) {
            ps.println(employee);
        }
    }

    public void printManagers(PrintStream ps) {
        for (Employee employee : this.employees) {
            if (employee instanceof Manager)
                ps.println(employee);
        }
    }

    public void sortByComparator(Comparator<Employee> comparator) {
        this.employees.sort(comparator);
    }

}
