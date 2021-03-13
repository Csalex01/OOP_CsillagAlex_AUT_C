package models;

import utils.Degree;
import utils.Department;

public class Teacher {
    /*
        Fields
     */

    public static int currentNumberOfTeachers = 0;

    private final String firstName;
    private final String lastName;
    private final String degree;
    private final String department;
    private final int teacherID;

    /*
        Constructor(s)
     */

    public Teacher(String fristName, String lastName, String degree, String department) {
        currentNumberOfTeachers++;

        this.firstName = fristName;
        this.lastName = lastName;
        this.degree = degree;
        this.department = department;
        this.teacherID = currentNumberOfTeachers;
    }

    /*
        Getter methods
     */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDegree() {
        return degree;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append(this.firstName)
            .append(" ")
            .append(this.lastName)
            .append(": ")
            .append(this.degree)
            .append(", ")
            .append(this.department);

        return str.toString();
    }
}
