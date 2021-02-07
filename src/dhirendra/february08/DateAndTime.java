package dhirendra.february08;

import java.time.LocalDate;
import java.util.Calendar;
public class DateAndTime {
    public static String findDay(int month, int day, int year) {
    return LocalDate.of(month,day,year).getDayOfWeek().name();
    }
}

