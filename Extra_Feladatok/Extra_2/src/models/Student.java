package models;

/*
    Import from other packages
 */

import enums.Major;

public class Student {

    /*
        Fields
     */

    private final String neptunCode;
    private final String firstName;
    private final String lastName;
    private final Major major;


    /*
        Constructor(s)
     */

    public Student(String neptunCode, String firstName, String lastName, Major major) {
        this.neptunCode = neptunCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;

    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Major getMajor() {
        return major;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append(this.neptunCode)
            .append(": ")
            .append(this.firstName)
            .append(" ")
            .append(this.lastName)
            .append(", ")
            .append(this.major);

        return str.toString();
    }
}
