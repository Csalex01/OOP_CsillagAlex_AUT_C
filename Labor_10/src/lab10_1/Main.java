package lab10_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int year = 2021, month, day;
        int index = 0;
        Random random = new Random();

        ArrayList<MyDate> dateArrayList = new ArrayList<>();
        MyDate[] dateArray = new MyDate[10];

        // Generálás

        for(int i = 0; i < 10; i++) {
            month = random.nextInt(12) + 1;
            day = random.nextInt(31) + 1;

            if(DateUtil.isValidDate(year, month, day)) {
                dateArrayList.add(new MyDate(year, month, day));
                dateArray[index++] = new MyDate(year, month, day);
            } else i--;
        }

        // Kiíratás

        System.out.println("Rendezés előtt: \n");

        System.out.println("ArrayList\n----------");
        for(MyDate date : dateArrayList)
            System.out.println(date);

        System.out.println("\nArray\n----------");
        for(MyDate date : dateArray)
            System.out.println(date);

        // Rendezés

        Collections.sort(dateArrayList);
        Arrays.sort(dateArray);

        // Kiíratás

        System.out.println("\nRendezés után: \n");

        System.out.println("ArrayList\n----------");
        for(MyDate date : dateArrayList)
            System.out.println(date);

        System.out.println("\nArray\n----------");
        for(MyDate date : dateArray)
            System.out.println(date);
    }

}
