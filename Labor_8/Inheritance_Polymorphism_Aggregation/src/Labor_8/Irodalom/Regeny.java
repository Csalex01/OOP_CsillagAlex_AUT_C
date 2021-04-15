package Labor_8.Irodalom;

public class Regeny extends Irodalom {

    private final String cselekmeny;
    private final int fejezetekSzama;

//    public Regeny(String cselekmeny, int fejezetekSzama) {
//        super(); // Implicit konstruktor hívás, ha nincs ott nem probléma
//        this.cselekmeny = cselekmeny;
//        this.fejezetekSzama = fejezetekSzama;
//    }
//
//    public Regeny(String cim, String cselekmeny, int fejezetekSzama) {
//        super(cim);
//        this.cselekmeny = cselekmeny;
//        this.fejezetekSzama = fejezetekSzama;
//    }

    public Regeny(int terjedelem,
                  String szerzo,
                  String cim,
                  int publikalasEve,
                  String cselekmeny,
                  int fejezetekSzama) {

        // EZ AZ ELSŐ DOLOG!
        super(terjedelem, szerzo, cim, publikalasEve);

        this.cselekmeny = cselekmeny;
        this.fejezetekSzama = fejezetekSzama;

    }

    public boolean igazTortenetE() {
        return true;
    }

    @Override
    public void leiras() {
        System.out.println("Ez egy regény.");
    }

    // REGÉNY - ősosztály toString() - fejezetek száma, cselekmény
    @Override
    public String toString() {
        return "REGÉNY\n" +
                super.toString() +
                "\tFejezetek száma: " + this.fejezetekSzama + "\n" +
                "\tCselekmény: " + this.cselekmeny + "\n";
    }
}
