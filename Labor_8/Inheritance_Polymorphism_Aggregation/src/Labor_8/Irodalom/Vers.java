package Labor_8.Irodalom;

public class Vers extends Irodalom {

    private final String rim;
    private final String liraiEn;
    private final int szakaszokSzama;

    public Vers(int terjedelem,
                String szerzo,
                String cim,
                int publikalasEve,
                String rim,
                String liraiEn,
                int szakaszokSzama) {

        super(terjedelem, szerzo, cim, publikalasEve);
        this.rim = rim;
        this.liraiEn = liraiEn;
        this.szakaszokSzama = szakaszokSzama;

    }

    @Override
    public void leiras() {
        System.out.println("Eez egy vers.");
    }

    @Override
    public String toString() {
        return "VERS\n" +
                super.toString() +
                "\tRím: " + this.rim + "\n" +
                "\tLírai én: " + this.liraiEn + "\n" +
                "\tSzakaszok száma: " + this.szakaszokSzama + "\n";
    }
}
