package labor4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = readFromCSVFile("lab4_2_input.csv");

        // Modification recommended by IntelliJ IDEA
        assert customers != null;
        // ----------

        for(Customer c : customers)
            System.out.println(c);
    }

    public static ArrayList<Customer> readFromCSVFile(String fileName) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        if(scanner == null)
            return null;

        ArrayList<Customer> customers = new ArrayList<>();
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] items = line.trim().split(", ");

            if(line.isEmpty())
                continue;

            if(items[0].equals("Customer"))
                customers.add(new Customer(items[1], items[2]));
            else if(items[0].equals("Account")) {
                customers.get(customers.size() - 1).addAccount(new BankAccount(items[1]));
                customers.get(customers.size() - 1).getAccount(items[1]).deposit(Integer.parseInt(items[2]));
            }
        }

        return customers;
    }
}
