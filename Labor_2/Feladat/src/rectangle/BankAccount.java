package rectangle;

public class BankAccount {
    private double balance;
    private String accountNumber;

    BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    void deposit(double ammount) {
        if(ammount < 0)
            return;

        this.balance += ammount;
    }

    boolean withdraw(double ammount) {
        if(this.balance - ammount < 0)
            return false;

        this.balance -= ammount;
        return true;    }
}
