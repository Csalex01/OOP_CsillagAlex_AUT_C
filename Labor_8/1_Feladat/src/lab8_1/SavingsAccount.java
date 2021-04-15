package lab8_1;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() {
        this.balance += this.balance * this.interestRate;
    }

    @Override
    public String toString() {
        return this.accountNumber + " (Savings account):\n\t\tBalance: EUR " + this.balance + "\n" +
                "\t\tInterest: " + this.interestRate + "\n";
    }
}
