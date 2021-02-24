package org.csalex;

/*

    EZ A FELADAT NINCS MÉG BEFEJEZVE!

 */

public class Main {

    public static void main(String[] args) {

    }

    public static double[] max2 (double[] array) {
        double[] max = {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};

        if(array.length == 0)
            return max;

        /**
         * Ez veszélyes. Mi van, ha csak egy eleme van az array-nek?
         */
        max[0] = array[0];
        max[1] = array[1];

        for(int i = 1; i < array.length; i++) {

        }

        return null;
    }
}
