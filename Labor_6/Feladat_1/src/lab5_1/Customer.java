package lab5_1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private static int numCustomers = 0;

    private int id;
    private final String firstName;
    private String lastName;
    private final ArrayList<BankAccount> accounts;

    public Customer(String firstName, String lastName) {
        Customer.numCustomers++;
        this.id = Customer.numCustomers - 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }

    /*
           Setter methods
     */

    /**
     * Adds a specified account to the existing accounts
     * @param account the account you want to add
     */
    public void addAccount(BankAccount account) {
            this.accounts.add(account);
    }

    /**
     * Sets the lasst name of the customer
     * @param lastName the name you want to set
     */
    public void setLastName(String lastName) {
        if (lastName.length() > 0)
            this.lastName = lastName;
    }

    /*
        Getter methods
     */

    /**
     * @return return the customer's id
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return the number of accounts for the customer
     */
    public int getNumAccounts() {
        return this.accounts.size();
    }

    /**
     * Returns the account numbers that the customer has
     * @return account number
     */
    public ArrayList<String> getAccountNumbers() {
        ArrayList<String> accountNumbersList = new ArrayList<>();

        for(BankAccount account : this.accounts)
            accountNumbersList.add(account.getAccountNumber());

        return accountNumbersList;
    }

    /**
     * Returns a bank account specified by the account number
     * @param accountNumber the account number
     * @return a BankAccount which has the account number specified in the parameter list
     */
    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : this.accounts)
            if (account.getAccountNumber().equals(accountNumber))
                return account;

        System.out.println("ACCOUNT NUMBER \"" + accountNumber + "\" DOES NOT EXIST!");
        return null;
    }

    /**
     * @return the customer's first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @return the customer's last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /*
        Other methods
     */

    /**
     * Closes an account based on the
     * @param accountNumber the account you want to close
     */
    public void closeAccount(String accountNumber) {
        for(BankAccount account: this.accounts) {
            if(account != null && account.getAccountNumber().equals(accountNumber)) {
                this.accounts.remove(account);
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(firstName).append(' ').append(lastName).append("'s accounts:\n");

        if (this.accounts.size() == 0)
            result.append("\tNONE");
        else
            for (BankAccount account : this.accounts)
                if (account != null)
                    result.append("\t").append(account.toString()).append("\n");

        return result.toString();
    }
}
