package org.csalex;

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
