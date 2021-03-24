package labor4_3;

public class Main {
    public static void main(String[] args) {
        double[] d1 = {1, 2, 3, 4, 5};

        MyArray a1 = new MyArray(10);
        MyArray a2 = new MyArray(d1);
        MyArray a3 = new MyArray(a2);

        MyArray a4 = new MyArray("data.txt");

        MyArray a5 = new MyArray(10);
        a5.fillRandom(0, 10);

        System.out.println(a5);
        System.out.println("Mean: " + String.format("%.3f", a5.mean()));
        System.out.println("Standard deviation: " + String.format("%.2f", a5.stddev()));

        a5.sort();
        System.out.println(a5);
    }
}
