package lab8_1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private final ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    /*
        Getter methods
     */

    /**
     * Returns a customer from the exitsting customers whose accountId matches the id specified in the parameter list
     * @param customerId the id of the customer you're lookng for
     * @return the customer whose id matches customerId
     */
    public Customer getCustomer(int customerId) {
        for(Customer c : this.customers)
            if(c.getId() == customerId)
                return c;

        return null;
    }

    /**
     * @return the number of customers
     */
    public int numCustomers() {
        return this.customers.size();
    }

    /*
        Other methods
     */

    /**
     * Adds a customer to the arraay list
     * @param customer the customer you want to add
     */
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    /**
     * Prints the customers to the specified print stream
     * @param ps the print stream you want to print to
     */
    private void printCustomers(PrintStream ps) {
        ps.println("ID, First_Name, Last_Name, Number_of_Bank_Accounts");

        StringBuilder buffer = new StringBuilder();

        for(Customer customer : this.customers) {
            buffer.append(customer.getId()).append(", ")
                    .append(customer.getFirstName()).append(", ")
                    .append(customer.getLastName()).append(", ")
                    .append(customer.getNumAccounts())
                    .append("\n");
        }

        ps.print(buffer);
    }

    /**
     * Prints the customers to the standard output
     */
    public void printCustomersToStdout() {
        this.printCustomers(System.out);
    }

    /**
     * Writes the customer to a file
     * @param fileName the file you want to write to
     */
    public void printCustomersToFile(String fileName) {
        try {
            this.printCustomers(new PrintStream(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}