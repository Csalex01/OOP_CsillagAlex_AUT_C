package org.csalex;

/**
 * Az arra alkalmas helyeken használhatod az for enhanced (foreach szerű) változatát. Néha sokkal elegánsabb.
 * Ha megy és érthető, akkor a String összefűzéseknél ismét sokkal elegánsabb a StringBuilder használata
 * Mindkettőt ajánlja az IntelliJ. A megfelelő ajánlatokat néha érdemes elfogadni.
 */
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
