package org.csalex;

/**
 * Szép megoldás. Laboron megnézünk még egyet, ami még elegánsabb, kevesebb kódot tartalmaz.
 * Esetleg próbáld ki: fel kell használni benne a subString metódust.
 */
public class Main {

    public static void main(String[] args) {
        String almafa = "ALMAFA";

        for(int i = 0; i < almafa.length(); i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(almafa.charAt(j));
            }
            System.out.println();
        }
    }
}
