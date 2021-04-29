package lab10_1;

public class DateUtil {

    public static boolean leapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || day < 1 || month > 12 || day > 31) {
            return false;
        }

        if (month == 2) {
            return day <= (leapYear(year) ? 29 : 28);
        }

        return day <= ((month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31);
    }

}
