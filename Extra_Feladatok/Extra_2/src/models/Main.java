package models;

import enums.Degree;
import enums.Department;
import enums.Major;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {
    public static Course[] courses;

    public static void main(String[] args) {
        String[] studentsData = readFromFile("students.csv");
        String[] coursesData = readFromFile("university.csv");

        // Accepted modification by IntelliJ IDEA
        assert studentsData != null;
        assert coursesData != null;
        // ----------

        Student[] students = new Student[studentsData.length];
        courses = new Course[coursesData.length];

        for (int i = 0; i < coursesData.length; i++) {
            if (coursesData[i] != null) {
                String[] data = coursesData[i].split(",");
                courses[i] = new Course(data[0], Integer.parseInt(data[2]), DayOfWeek.values()[Integer.parseInt(data[1]) - 1]);
                courses[i].setTeacher(new Teacher(data[3], data[4], Degree.valueOf(data[5]), Department.values()[0]));
            }
        }

        for (int i = 0; i < studentsData.length; i++) {
            if (studentsData[i] != null) {
                String[] data = studentsData[i].split(",");
                students[i] = new Student(data[0], data[1], data[2], Major.valueOf(data[3]));

                for (Course c : courses)
                    if (c != null)
                        for (int j = 4; j < 7; j++)
                            if (data.length > j && c.getCourseID().equals(data[j]))
                                c.enrollStudent(students[i]);
            }
        }

        // Example for Major.AUTOMATION_AND_APPLIED_INFORMATICS
        for(Course c : courses) {
            if(c != null) {
                System.out.print(c.getCourseID() + ": \n");
                printEnrolledStudentsByMajor(Major.AUTOMATION_AND_APPLIED_INFORMATICS, c.getCourseID());
            }
        }
    }

    public static String[] readFromFile(String fileName) {
        try {
            File fin = new File(fileName);
            Scanner scanner = new Scanner(fin);

            StringBuilder str = new StringBuilder();
            int rowCount = 0;

            String[] data = new String[120];

            while (scanner.hasNextLine()) {
                str.append(scanner.next()).append(",").append(scanner.next());
                data[rowCount++] = str.toString();
                str.delete(0, str.length());
            }

            return data;

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
            return null;
        }
    }

    public static void printEnrolledStudentsByMajor(Major major, String courseId) {
        for (Course c : courses) {
            if (c != null && c.getCourseID().equals(courseId))
                for (Student s : c.getEnrolledStudents())
                    if (s != null && s.getMajor().equals(major))
                        System.out.println(s);
        }
    }

    public static void cancelEnrollments(String fileName) {

    }

    public static Course[] courseByTeacherDegree(Degree degree) {
        return null;
    }

    public static int nrOfCoursesByDay(DayOfWeek dayOfWeek) {
        return DayOfWeek.MONDAY.getValue();
    }
}
