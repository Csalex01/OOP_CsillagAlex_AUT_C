package lab10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Storage {

    private ArrayList<Product> products;

    public Storage(String fileName) {
        this.products = new ArrayList<>();

        this.readProductsFromFile(fileName);

        this.sortByComparator(Product::compareTo);
    }

    private ArrayList<String> readFromFile(String fileName) {
        Scanner scanner;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        ArrayList<String> lines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }

        return lines;
    }

    private void readProductsFromFile(String fileName) {

        ArrayList<String> rows = this.readFromFile(fileName);

        if(rows == null)
            return;

        for(String row : rows) {
            String[] fields = row.split(" ");

            this.products.add(new Product(
                    Integer.parseInt(fields[0]),
                    Integer.parseInt(fields[2]),
                    Integer.parseInt(fields[3]),
                    fields[1]
            ));
        }
    }

    public void update(String fileName) {
        int updateCounter = 0;

        ArrayList<String> rows = this.readFromFile(fileName);

        if(rows == null)
            return;

        for(String row : rows) {
            String[] fields = row.split(" ");

            try {
                this.findProduct(Integer.parseInt(fields[0])).increaseAmount(Integer.parseInt(fields[1]));
                updateCounter++;
            } catch (NullPointerException ignored) {}
        }

        System.out.println("---------------");
        System.out.println("Updated " + updateCounter + " products!");
        System.out.println("---------------\n");
    }

    public Product findProduct(int ID) {
        for(Product p : this.products)
            if(p.getID() == ID)
                return p;

        return null;
    }

    public void printProducts() {
        System.out.println("Products: \n");
        for(Product p : this.products)
            System.out.println(p);
    }

    private void sortByComparator(Comparator<Product> comparator) {
        this.products.sort(comparator);
    }
}
