package labor5_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        readFilePrintItsLineNumbered("lab4_1_input.txt");
        System.out.println("----------");

        ArrayList<Person> people = readFromCSVFile("lab4_1_input.csv");

        if(people == null)
            return;

        for(Person p : people)
            System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getBirthYear());
    }

    public static void readFilePrintItsLineNumbered(String fileName) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
            int line = 1;

            while(scanner.hasNext()) {
                System.out.println(line + ": " + scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Person> readFromCSVFile(String fileName) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if(scanner == null)
            return null;

        ArrayList<Person> people = new ArrayList<>();

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if(line.isEmpty())
                continue;;

            String[] items = line.split(",");
            String firstName = items[0].trim();
            String lastName = items[1].trim();
            int birthYear = Integer.parseInt(items[2].trim());

            people.add(new Person(firstName, lastName, birthYear));
        }

        return people;
    }
}
