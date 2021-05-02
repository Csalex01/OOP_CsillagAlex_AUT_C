package lab10_3;

public class Product implements Comparable<Product> {
    private final int ID;
    private int amount;
    private final int price;

    private final String name;

    public Product(int ID, int amount, int price, String name) {
        this.ID = ID;
        this.amount = amount;
        this.price = price;
        this.name = name;
    }

    // GETTER Methods

    public int getID() {
        return this.ID;
    }

    public int getAmount() {
        return this.amount;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    // OTHER Methods

    public void increaseAmount(int newAmount) {
        this.amount += newAmount;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(this.ID).append("\n")
                .append("\tName: ").append(this.name).append("\n")
                .append("\tAmount: ").append(this.amount).append("\n")
                .append("\tPrice: ").append(this.price).append("\n")
                .append("----------\n");

        return buffer.toString();
    }

    @Override
    public int compareTo(Product o) {
        return this.ID - o.getID();
    }
}
