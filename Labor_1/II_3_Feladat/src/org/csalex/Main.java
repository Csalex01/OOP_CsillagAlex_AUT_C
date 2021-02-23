package org.csalex;

public class Main {

    public static void main(String[] args) {
        int number = 127;

        System.out.println(number + ": " + countBits(number));
    }

    // 13 -> 1101
    private static int countBits(int number) {
        int count = 0;

        for(int i = 0; i < 8; i++) {
            count += (number >> i) & 1;
        }

        return count;
    }
}
