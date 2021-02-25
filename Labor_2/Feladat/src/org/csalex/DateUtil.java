package org.csalex;

public class DateUtil {
    public static boolean leapYear(int year)  {

        if(year % 400 == 0)
            return true;
        else if(year % 100 == 0)
            return false;
        else return year % 4 == 0;
    }

    static boolean isValidDate(int year, int month, int day) {
        if(year < 0) return false;

        if(month < 0 || month > 12) return false;

        if(month == 2 && (day < 0 || day > 28)) return false;

        if(
            (month == 4 || month == 6 || month == 9 || month == 11)
            && (day < 0 || day > 30)
            )
            return false;

        return (month != 1 && month != 3 && month != 5 && month != 7
                && month != 8 && month != 10 && month != 12)
                || (day >= 0 && day <= 31);
    }
}
