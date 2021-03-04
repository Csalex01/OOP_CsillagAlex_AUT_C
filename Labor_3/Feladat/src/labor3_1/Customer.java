package labor3_1;

public class Customer {
    private final String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = null;
    }

    /*
           Setter methods
     */

    public void setAccount(BankAccount account) {
        if(this.account == null) {
            this.account = account;
            return;
        }

        account.deposit(this.account.getBalance());
        this.account.withdraw(this.account.getBalance());

        this.account = account;
    }

    public void setLastName(String lastName) {
        if(lastName.length() > 0)
            this.lastName = lastName;
    }

    /*
        Getter methods
     */

    public BankAccount getAccount() {
        return this.account;
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

    public void closeAccount() {
        if(this.account != null)
            this.account = null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append(this.firstName)
            .append(" ")
            .append(this.lastName)
            .append("\n\tAccount number: \t");

        if(this.account != null)
            str.append(this.account.getAccountNumber())
                .append("\n\tBalance: \t\t\tEUR")
                .append(this.account.getBalance());
        else
            str.append("D.N.E");

        str.append("\n");

        return str.toString();
    }
}
