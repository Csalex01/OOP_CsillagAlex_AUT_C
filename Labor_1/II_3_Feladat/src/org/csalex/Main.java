package org.csalex;

public class Main {

    public static void main(String[] args) {
        int number = 127;

        System.out.println(number + ": " + countBits(number));

        /**
         * és ide írhattad volna a meghívását egy másik függvénynek
         */
        for (int i = 0; i < 20; i++) {
            System.out.print(getBit(number, i) + " ");
        }
    }

    // 13 -> 1101
    private static int countBits(int number) {
        int count = 0;

        /**
         * Ha esetleg nem tudjuk ezt, hogy 8 biten van ábrázolva, egy lehetséges megoldás lehet, hogy
         * while-al megyünk, amíg nem 0 a number.
         * while(number) { count += number &1; number = number >> 1; }
         */
        for(int i = 0; i < 8; i++) {
            count += (number >> i) & 1;
        }

        return count;
    }

    /**
     * Ha egy projektbe tetted volna a feladatokat ide tehetted volna például valamelyik másik függvényt.
     */
    private static byte getBit(int number, int order) {
        return order > 8 ? 1 : (byte)((number >> order) & 1);
    }
}
