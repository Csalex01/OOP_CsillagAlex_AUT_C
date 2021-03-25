package lab5_1;

public class BankAccount {

    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;

    private double balance;
    private final String accountNumber;

    BankAccount() {
        BankAccount.numAccounts++;
        this.accountNumber = createAccountNumber();
        this.balance = 0;
    }

    /*
        Getter methods
     */

    /**
     * @return account balance
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * @return account number
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /*
        Other methods
     */

    /**
     * Generates a unique account number based on prefix and the number of existing accounts
     * @return unique account number
     */
    private static String createAccountNumber() {
        if(BankAccount.numAccounts > Math.pow(10, 7)) {
            System.out.println("Could not create account number!");
            return BankAccount.PREFIX + "0".repeat(7);
        }

        StringBuilder str = new StringBuilder();

        str.append(BankAccount.PREFIX);

        for (int i = 0; i < BankAccount.ACCOUNT_NUMBER_LENGTH - BankAccount.PREFIX.length() - Math.log10(BankAccount.numAccounts) - 1; i++) {
            str.append("0");
        }

        str.append(BankAccount.numAccounts);

        return str.toString();

//        return BankAccount.PREFIX + "0".repeat(BankAccount.ACCOUNT_NUMBER_LENGTH - BankAccount.PREFIX.length() - String.valueOf(BankAccount.numAccounts).length()) + numAccounts;
    }

    /**
     * Adds a specified ammount to the account's balance
     * @param amount the amount that you want to add to the balance
     */
    void deposit(double amount) {
        if (amount < 0)
            return;

        this.balance += amount;
    }

    /**
     * Remove a certain ammount of money from the balance
     * @param amount the ammount you want to withdraw
     * @return successful operation
     */
    boolean withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("You do not have sufficient funds for this operation!");
            return false;
        }

        this.balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return this.accountNumber + ": EUR " + this.balance;
    }
}
