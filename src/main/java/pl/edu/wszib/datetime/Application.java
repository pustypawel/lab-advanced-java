package pl.edu.wszib.datetime;

import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        System.out.println("Day of month = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Date original = " + date);
        System.out.println("Date from calendar = " + calendar.getTime());

        calendar.set(Calendar.DAY_OF_MONTH, 21);
        System.out.println("Day of month = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Date original = " + date);
        System.out.println("Date from calendar = " + calendar.getTime());
        // JodaTime: https://www.joda.org/joda-time/

        System.out.println();
        System.out.println();
        System.out.println("Calendar = " + calendar.getTime());
        calculate(calendar);
        System.out.println("Calendar = " + calendar.getTime());
    }

    private static Integer calculate(Calendar calendar) {
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + 7);
        // jakaś kalkulacja
        return 10;
    }

    public record Pair(Calendar from, Calendar to) {

    }
}
