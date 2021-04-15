package Labor_8.Irodalom;

public class Irodalom {

    protected int terjedelem;
    protected String szerzo;
    protected String cim;
    protected int publikalasEve;

//    public Irodalom() {
//
//    }
//
//    public Irodalom(String cim) {
//        this.cim = cim;
//    }

    public Irodalom(int terjedelem, String szerzo, String cim, int publikalasEve) {
        this.terjedelem = terjedelem;
        this.szerzo = szerzo;
        this.cim = cim;
        this.publikalasEve = publikalasEve;
    }

    public void leiras() {
        System.out.println("Egyszerű irodalmi mű.");
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append("\tCím: ").append(this.cim).append("\n");
        buffer.append("\tSzerző: ").append(this.szerzo).append("\n");
        buffer.append("\tTerjedelem: ").append(this.terjedelem).append("\n");
        buffer.append("\tPublikálás éve: ").append(this.publikalasEve).append("\n");

        return buffer.toString();
    }
}
