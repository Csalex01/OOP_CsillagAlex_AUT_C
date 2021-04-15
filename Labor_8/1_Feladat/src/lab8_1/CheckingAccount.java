package lab8_1;

public class CheckingAccount extends BankAccount{

    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        super();
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(double amount) {
        if(this.balance - amount >= 0) {
            this.balance -= amount;
            return  true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.accountNumber + " (Checking account):\n\t\tBalance: EUR " + this.balance + "\n" +
                "\t\tOverdraft limit: " + this.overdraftLimit + "\n";
    }
}
