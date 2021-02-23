package org.csalex;

public class Main {

    public static void main(String[] args) {
        double[] arr = {-4, 3, 2.71, 3.14159, 2.71, 1.6, -1.6};
        
        System.out.println("Avg: " + mean(arr));
    }

    private static double mean(double[] array) {

        if(array.length == 0)
            return Double.NaN;

        double sum = 0;

        for(double el : array) {
            sum += el;
        }

        return sum / array.length;
    }
}
