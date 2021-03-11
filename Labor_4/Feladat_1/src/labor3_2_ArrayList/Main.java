package labor3_2_ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "WICK");
        Customer customer2 = new Customer("Elliot", "PAGE");

        for(int i = 1; i <= 5; i++) {
            customer1.addAccount(new BankAccount("OTP0000" + i));
            customer1.getAccount("OTP0000" + i).deposit(i * 100);
        }

        for(int i = 1; i <= 9; i++) {
            customer2.addAccount(new BankAccount("OTP0000" + i));
            customer2.getAccount("OTP0000" + i).deposit(i * 100);
        }

        System.out.println(customer1);
        System.out.println(customer2);

        customer1.closeAccount("OTP00001");
        customer2.closeAccount("OTP0000" + customer2.getNumAccounts());

        System.out.println("==========");

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
