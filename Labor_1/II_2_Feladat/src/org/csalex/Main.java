package org.csalex;

public class Main {

    public static void main(String[] args) {
        int number = 13;

        for (int i = 0; i < 20; i++) {
            System.out.print(getBit(number, i) + " ");
        }
    }

    // 13 -> 1101
    private static byte getBit(int number, int order) {
        return order > 8 ? 1 : (byte)((number >> order) & 1);
    }
}
