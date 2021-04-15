package Labor_8.Irodalom;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Regeny regeny1 = new Regeny(283,
                "Rejto Jeno",
                "Piszkos Fred, a kapitany",
                1940,
                "bűnügy",
                24);

        Regeny regeny2 = new Regeny(11,
                "Harper Lee",
                "Ne bántsátok a feketerigót",
                1990,
                "Lee kerülte a reflektorfényt",
                34);

        Regeny regeny3 = new Regeny(3200,
                "Sui Ishida",
                "Tokyo Ghoul",
                2020,
                "Mikor nem az ember all a taplaleklanc tetejen, " +
                        "hanem valami sokkal gyorsabb es erosebb - egy ghoul. " +
                        "Fohosunk, Kaneki egy lesz kozuluk.",
                256);

        Regeny regeny4 = new Regeny(160,
                "A nep nem trefal",
                "Tomorkeny Istvan",
                2000,
                "Eletkepet fest",
                28);

        Vers vers1 = new Vers(10,
                "Arany János",
                "Mátyás Anyja",
                1854,
                "Félrím", // Nem jó adat
                "Ötletem nincs", // Nem jó adat
                18);

        Vers vers2 = new Vers(1,
                "Toth Arpad",
                "Koruti hajnal",
                1923,
                "keresztrim",
                "ember",
                5);

        ArrayList<Irodalom> alkotasok = new ArrayList<>();

        alkotasok.add(regeny1);
        alkotasok.add(regeny2);
        alkotasok.add(regeny3);
        alkotasok.add(regeny4);
        alkotasok.add(vers1);
        alkotasok.add(vers2);

        for (Irodalom i : alkotasok) {
            i.leiras();

            if (i instanceof Regeny)
                System.out.println("Igaz történet: " + ((Regeny) i).igazTortenetE());

            System.out.println(i);
        }
    }

}
