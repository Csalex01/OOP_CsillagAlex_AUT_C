package lab10_2;

import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("TengszLengszKFT");

        company.hireAll("employees.csv");

//        company.sortByComparator(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.compareTo(o2);
//            }
//        });

//        company.sortByComparator(Employee::compareTo);

        company.sortByComparator((o1, o2) -> o1.compareTo(o2));

        System.out.println("----------------------------------------");
        System.out.println("Sorted employees in lexicographic order:");
        System.out.println("----------------------------------------");

        company.printAll(System.out);
    }

}