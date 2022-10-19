import java.util.Date;

public class CalculateNextDay {
    public static Date getNextDay(Date toDay) {
        if (isEndOfYear(toDay)) {
            return new Date(toDay.getYear() + 1, 1, 1);
        } else if (isEndOfMonth(toDay)) {
            return new Date(toDay.getYear(), toDay.getMonth() + 1, 1);
        } else {
            return new Date(toDay.getYear(), toDay.getMonth(), toDay.getDate() + 1);

        }
    }

    private static boolean isEndOfYear(Date toDay) {
        if (toDay.getDate() == 31 && toDay.getMonth() == 12) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isEndOfMonth(Date toDay) {
        int day = toDay.getDate();
        int month = toDay.getMonth();

        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day == 31) {
            return true;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            return true;
        } else if (month == 2) {
            if (isLeapYear(toDay) && day == 29 || !isLeapYear(toDay) && day == 28) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private static boolean isLeapYear(Date toDay) {
        int year = toDay.getYear();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }

    }

}