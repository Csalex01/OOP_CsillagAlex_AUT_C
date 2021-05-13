package lab11_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Input: ");
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().trim().split(" ");

        float sum = 0;

        for(String number : input)
            try {
                sum += Float.parseFloat(number);
            } catch (NumberFormatException e) {
                System.out.println("Wrong number formatting!");
            }


        System.out.println("Sum: " + sum);
    }
}
