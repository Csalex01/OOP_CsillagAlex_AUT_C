package labor4_2;

import java.util.ArrayList;

public class Customer {
    public static final int MAX_ACCOUNTS = 10;

    private final String firstName;
    private String lastName;
    private final ArrayList<BankAccount> accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }

    /*
           Setter methods
     */

    public void addAccount(BankAccount account) {
        if (this.accounts.size() < MAX_ACCOUNTS) {
            this.accounts.add(account);
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 0)
            this.lastName = lastName;
    }

    /*
        Getter methods
     */

    public int getNumAccounts() {
        return this.accounts.size();
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : this.accounts)
            if (account.getAccountNumber().equals(accountNumber))
                return account;

        System.out.println("ACCOUNT NUMBER \"" + accountNumber + "\" DOES NOT EXIST!");
        return null;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    /*
        Other methods
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
            result.append("\tNONE\n");
        else
            for (BankAccount account : this.accounts)
                if (account != null)
                    result.append("\t").append(account.toString()).append("\n");

        return result.toString();
    }
}
