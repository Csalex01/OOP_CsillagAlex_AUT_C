package models;

/*
    Import from other packages
 */

import java.time.DayOfWeek;

public class Course {

    /*
        Fields
     */

    public static int MAX_STUDENTS = 120;

    private Teacher teacher;
    private final String courseID;
    private final Student[] enrolledStudents;
    private final int numberOfCredits;
    private int numberOfEnrolledStudents;
    private final DayOfWeek dayOfCourse;

    /*
        Constructor(s)
     */

    public Course(String courseID, int numberOfCredits, DayOfWeek dayOfCourse) {
        this.courseID = courseID;
        this.numberOfCredits = numberOfCredits;
        this.enrolledStudents = new Student[MAX_STUDENTS];
        this.dayOfCourse = dayOfCourse;
    }

    public Student[] getEnrolledStudents() {
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
        if(this.numberOfEnrolledStudents > MAX_STUDENTS)
            return;

        this.enrolledStudents[this.numberOfEnrolledStudents++] = student;
    }

    public void cancelEnrollmentOfStudent(String neptunCode) {
        for(int i = 0; i < this.numberOfEnrolledStudents; i++) {
            if(this.enrolledStudents[i].getNeptunCode().equals(neptunCode)) {
                this.enrolledStudents[i] = null;
                this.numberOfEnrolledStudents--;

                if (this.numberOfEnrolledStudents - i >= 0)
                    System.arraycopy(this.enrolledStudents, i + 1, this.enrolledStudents, i, this.numberOfEnrolledStudents - i);

                this.enrolledStudents[this.numberOfEnrolledStudents] = null;
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
            .append(this.teacher.getFristName())
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
                    .append(")\n");
        }

        return str.toString();
    }
}
