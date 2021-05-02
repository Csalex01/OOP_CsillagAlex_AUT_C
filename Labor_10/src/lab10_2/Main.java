package lab10_2;

import lab10_1.MyDate;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("TengszLengszKFT");

        company.hireAll("employees.csv");
        company.printAll(System.out);

        System.out.println("\nManagers only: ");

        company.printManagers(System.out);
    }

}
