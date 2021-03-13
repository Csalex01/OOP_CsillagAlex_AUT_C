package models;

import java.time.DayOfWeek;
import java.util.ArrayList;

public class Course {
        /*
        Fields
     */

    private Teacher teacher;
    private final String courseID;
    private final ArrayList<Student> enrolledStudents;
    private final int numberOfCredits;
    private final DayOfWeek dayOfCourse;

    /*
        Constructor(s)
     */

    public Course(String courseID, int numberOfCredits, DayOfWeek dayOfCourse) {
        this.courseID = courseID;
        this.numberOfCredits = numberOfCredits;
        this.enrolledStudents = new ArrayList<>();
        this.dayOfCourse = dayOfCourse;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getCourseID() {
        return courseID;
    }

    /*
        Setter methods
     */

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /*
        Getter methods
     */

    public Teacher getTeacher() {
        return teacher;
    }

    public DayOfWeek getDayOfCourse() {
        return dayOfCourse;
    }

    /*
        Other methods
     */

    public void enrollStudent(Student student) {
        this.enrolledStudents.add(student);
    }

    public void cancelEnrollmentOfStudent(String neptunCode) {
        for(int i = 0; i < this.enrolledStudents.size(); i++) {
            if(this.enrolledStudents.get(i).getNeptunCode().equals(neptunCode)) {
                this.enrolledStudents.set(i, null);
                this.enrolledStudents.remove(this.enrolledStudents.get(i));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Course: ")
                .append(this.courseID);

        str.append("\n\t\t")
                .append("Teacher: ")
                .append(this.teacher.getFirstName())
                .append(" ")
                .append(this.teacher.getLastName())
                .append(" - ")
                .append(this.teacher.getDegree())
                .append(" from ")
                .append(this.teacher.getDepartment())
                .append(" department");

        str.append("\n\t\t")
                .append("Credits: ")
                .append(this.numberOfCredits);

        str.append("\n\t\t")
                .append("Occurs every: ")
                .append(this.dayOfCourse);

        str.append("\n\t\t").
                append("Enrolled students: \n");

        for(Student student : this.enrolledStudents) {
            if(student != null)
                str.append("\t\t\t- ")
                        .append(student.getFirstName())
                        .append(" ")
                        .append(student.getLastName())
                        .append(" (")
                        .append(student.getNeptunCode())
                        .append(", ")
                        .append(student.getMajor())
                        .append(")\n");
        }

        return str.toString();
    }
}
