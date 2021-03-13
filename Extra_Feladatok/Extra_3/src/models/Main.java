package models;

import utils.Major;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("AVLMO7", "Anne", "Bell", "DENTISTRY");
        Student student2 = new Student("QSMBA1", "Alex", "Csillag", "AUTOMATION_AND_APPLIED_INFORMATICS");
        Teacher teacher1 = new Teacher("Suzanne", "Grey", "DOCENT", "MEDICAL");

//        System.out.println(student1);
//        System.out.println(teacher1);
//
//        System.out.println(Major.data.get(student1.getMajor()));
//
//        for(String key : Major.data.keySet())
//            System.out.println(key + " -> " + Major.data.get(key));

        Course course1 = new Course("MB_INFO20", 5, DayOfWeek.FRIDAY);

        course1.setTeacher(teacher1);
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        System.out.println(course1);
    }
}
