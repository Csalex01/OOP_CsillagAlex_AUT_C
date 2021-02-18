package org.csalex;

public class Main {

    public static void main(String[] args) {
	    String nev = "Csillag Alex";
	    String[] szavak = nev.split(" ");
	    String monogram = "";

	    for(int i = 0; i < szavak.length; i++) {
	        monogram += szavak[i].charAt(0);
        }

        System.out.println("Monogram: " + monogram);
    }
}
