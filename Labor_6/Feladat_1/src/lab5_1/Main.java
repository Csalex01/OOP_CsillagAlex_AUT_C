package lab5_1;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("OTP");

        Customer customer1 = new Customer("Alex", "CSILLAG");
        Customer customer2 = new Customer("John", "WICK");

        customer1.addAccount(new BankAccount());
        customer1.addAccount(new BankAccount());

        customer2.addAccount(new BankAccount());
        customer2.addAccount(new BankAccount());

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        System.out.println(customer1);

        bank.getCustomer(0).getAccount("OTP0000001").deposit(100);
        bank.getCustomer(0).getAccount("OTP0000002").deposit(200);

        bank.getCustomer(1).getAccount("OTP0000003").deposit(300);
        bank.getCustomer(1).getAccount("OTP0000004").deposit(400);

        System.out.println(customer2);

        bank.printCustomersToFile("bank_customers.csv");
    }
}
