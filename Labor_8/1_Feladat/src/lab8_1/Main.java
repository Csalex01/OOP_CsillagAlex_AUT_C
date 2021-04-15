package lab8_1;

public class Main {

    public static void main(String[] args) {
        Bank OTP = new Bank("OTP");

        Customer customer1 = new Customer("Alex", "Csillag");
        Customer customer2 = new Customer("Michael", "Cimino");

        customer1.addAccount(new SavingsAccount(0.0314));
        customer1.addAccount(new CheckingAccount(10));

        customer2.addAccount(new SavingsAccount(0.0271));
        customer2.addAccount(new SavingsAccount(20));

        customer1.getAccount("OTP0000001").deposit(100);
        ((SavingsAccount)customer1.getAccount("OTP0000001")).addInterest();

        customer1.getAccount("OTP0000002").deposit(200);
        customer2.getAccount("OTP0000003").deposit(300);
        customer2.getAccount("OTP0000004").deposit(400);

        customer1.getAccount("OTP0000001").withdraw(50);
        customer1.getAccount("OTP0000002").withdraw(100);
        customer2.getAccount("OTP0000003").withdraw(200);
        customer2.getAccount("OTP0000004").withdraw(250);

        System.out.println(customer1);
        System.out.println(customer2);


    }

}
