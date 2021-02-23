package org.csalex;

public class Main {

    public static void main(String[] args) {
        double[] array = {-4.2, 3.4, 5.5, -3.14, 2.71, 8.85};

        System.out.println("Max element: " + maxElement(array));
    }

    public static double maxElement(double[] array) {
        double max = Double.NEGATIVE_INFINITY;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
