package org.csalex;

public class Main {

    public static void main(String[] args) {
	    String nev = "Csillag Alex";

	    for(int i = 0; i < nev.length(); i++) {
            System.out.println(nev.charAt(i));
        }

	    String monogram = " Cs. A.";

	    nev += monogram;

        System.out.println(nev);
    }
}
