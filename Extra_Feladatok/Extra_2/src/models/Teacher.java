package models;

/*
    Import from other packages
 */

import enums.Degree;
import enums.Department;

public class Teacher {

    /*
        Fields
     */

    public static int currentNumberOfTeachers = 0;

    private String fristName;
    private String lastName;
    private Degree degree;
    private Department department;
    private int teacherID;

    /*
        Constructor(s)
     */

    public Teacher(String fristName, String lastName, Degree degree, Department department) {
        currentNumberOfTeachers++;

        this.fristName = fristName;
        this.lastName = lastName;
        this.degree = degree;
        this.department = department;
        this.teacherID = currentNumberOfTeachers;
    }

    /*
        Getter methods
     */

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public Degree getDegree() {
        return degree;
    }

    public Department getDepartment() {
        return department;
    }
}
