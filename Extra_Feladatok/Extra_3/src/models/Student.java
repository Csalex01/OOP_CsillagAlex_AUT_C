package models;

import utils.*;

import java.util.ArrayList;

public class Student {
     /*
        Fields
     */

    private final String neptunCode;
    private final String firstName;
    private final String lastName;
    private final String major;

    /*
        Constructor(s)
     */

    public Student(String neptunCode, String firstName, String lastName, String major) {
        this.neptunCode = neptunCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;

        if(!Major.data.containsKey(major))
            Major.data.put(major, new ArrayList<>());

        Major.data.get(major).add(this.neptunCode);
    }

    /*
        Getters
     */

    public String getNeptunCode() {
        return neptunCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
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
