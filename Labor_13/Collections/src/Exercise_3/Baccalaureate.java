package Exercise_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Baccalaureate {

    private final Map<Integer, Student> students;

    public Baccalaureate(String fileName) {
        this.students = new TreeMap<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNextLine()) {
                String[] items = scanner.nextLine().trim().split(" ");

                int ID = Integer.parseInt(items[0]);
                String firstName = items[1];
                String lastName = items[2];

                Student student = new Student(ID, firstName, lastName);

                students.put(ID, student);
            }

            /// Read marks from file associated with different subjects
            this.readSpecificMarks("hungarian.txt", Subject.HUNGARIAN);
            this.readSpecificMarks("mathematics.txt", Subject.MATHEMATICS);
            this.readSpecificMarks("romanian.txt", Subject.ROMANIAN);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    private void readSpecificMarks(String fileName, Subject subject) {
        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNextLine()) {
                String[] items = scanner.nextLine().trim().split(" ");

                int ID = Integer.parseInt(items[0]);
                double mark = Double.parseDouble(items[1]);

                students.get(ID).addMark(subject, mark);

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    public void printStudents() {
        System.out.println("Students: ");
        for (Map.Entry<Integer, Student> e : this.students.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    public void printPassedStudents() {
        System.out.println("Students who passed the exam: ");
        for (Map.Entry<Integer, Student> e : this.students.entrySet()) {
            if(e.getValue().hasPassed()) {
                System.out.println(e.getKey() + ": " + e.getValue());
            }
        }
    }

    public void printFailedStudents() {
        System.out.println("Students who did not pass the exam: ");
        for (Map.Entry<Integer, Student> e : this.students.entrySet()) {
            if(!e.getValue().hasPassed()) {
                System.out.println(e.getKey() + ": " + e.getValue());
            }
        }
    }
}
