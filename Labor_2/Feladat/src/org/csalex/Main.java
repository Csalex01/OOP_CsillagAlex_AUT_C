package org.csalex;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    private static void ex1() {
        System.out.println("Ex. 1:");

        BankAccount account1 = new BankAccount("OTP00001");
        BankAccount account2 = new BankAccount("OTP00002");

        System.out.println(account1);
        account1.deposit(1000);
        System.out.println(account1);

        if(account1.withdraw(500)) {
            System.out.println(account1);
        }

        if(account1.withdraw(1000)) {
            System.out.println(account1);
        }

        System.out.println(account2);
        account2.deposit(2000);
        System.out.println(account2);
    }

    private static void ex2() {
        System.out.println("\nEx. 2:");

        Rectangle  teglalap = new Rectangle();
        Rectangle  teglalap1 = new Rectangle(15,20);
        Rectangle  teglalap2 = new Rectangle(12);

        System.out.println(teglalap);
        System.out.println(teglalap1);
        System.out.println(teglalap2);

        System.out.println(teglalap.getWidth());
        teglalap.setWidth(100);
        System.out.println(teglalap);
    }

    private static void ex3() {
        System.out.println("\nEx. 3:");

        System.out.println(DateUtil.isValidDate(2000,2, 29));
        System.out.println(DateUtil.isValidDate(2000,2, 30));
        System.out.println(DateUtil.isValidDate(1900,2, 29));
        System.out.println(DateUtil.isValidDate(1900,2, 28));
        System.out.println(DateUtil.isValidDate(-1900,2, 28));
        System.out.println(DateUtil.isValidDate(0,2, 28));
        System.out.println(DateUtil.isValidDate(2021,2, 29));
        System.out.println(DateUtil.isValidDate(2020,2, 29));
        System.out.println(DateUtil.isValidDate(2020,1, 32));
        System.out.println(DateUtil.isValidDate(2020,1, 0));
        System.out.println(DateUtil.isValidDate(2020,0, 0));
        System.out.println(DateUtil.isValidDate(2020,4, 31));
    }

    private static void ex4() {
        System.out.println("\nEx. 4:");

        Random rand = new Random();

        int year, month, day;
        int count = 0;

        for(int i = 0; i < 100; i++) {
            year = rand.nextInt(3000);
            month = rand.nextInt(12) + 1;
            day = rand.nextInt(31) + 1;

            if(!DateUtil.isValidDate(year, month, day)) {
                MyDate date = new MyDate(year, month, day);
                count++;
                System.out.println(year + "/" + month + "/" + day);
            }
        }

        System.out.println("Invlaid dates: " + count);
    }
}
