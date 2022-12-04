package pl.edu.wszib.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Task2 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));

        System.out.println("Year = " + calendar.get(Calendar.YEAR));
        System.out.println("Month = " + calendar.get(Calendar.MONTH));
        System.out.println("Week of year = " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week of month = " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Day of month = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of year = " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day of week = " + calendar.get(Calendar.DAY_OF_WEEK));

        System.out.println("Hour = " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute = " + calendar.get(Calendar.MINUTE));
        System.out.println("Second = " + calendar.get(Calendar.SECOND));
        System.out.println("Millisecond = " + calendar.get(Calendar.MILLISECOND));
    }
}
