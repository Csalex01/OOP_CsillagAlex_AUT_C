package labor3_2;

public class Customer {
    public static final int MAX_ACCOUNTS = 10;

    private final String firstName;
    private String lastName;
    private int numAccounts;
    private BankAccount[] accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new BankAccount[MAX_ACCOUNTS];
    }

    /*
           Setter methods
     */

    void addAccount(BankAccount account) {
        if (this.numAccounts < MAX_ACCOUNTS) {
            this.accounts[numAccounts] = account;
            this.numAccounts++;
        }
    }

    void setLastName(String lastName) {
        if (lastName.length() > 0)
            this.lastName = lastName;
    }

    /*
        Getter methods
     */

    public int getNumAccounts() {
        return this.numAccounts;
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
        for (int i = 0; i < this.numAccounts; i++) {
            if (this.accounts[i].getAccountNumber().equals(accountNumber)) {
                this.accounts[i] = null;
                this.numAccounts--;

                // Accepted modification from IntelliJ IDEA
                if (this.numAccounts - i >= 0)
                    System.arraycopy(this.accounts, i + 1, this.accounts, i, this.numAccounts - i);
                // ----------
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(firstName).append(' ').append(lastName).append("'s accounts:\n");

        if (numAccounts == 0)
            result.append("\tNONE");
        else
            for (int i = 0; i < numAccounts; i++)
                result.append("\t").append(accounts[i].toString()).append("\n");

        return result.toString();
    }
}
