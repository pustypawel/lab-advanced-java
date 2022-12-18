package pl.edu.wszib.datetime.java8;

import java.time.*;

public class Task3 {

    public static void main(String[] args) {
        DateRange beginAndEndOfPrevMonth = getBeginAndEndOfPrevMonth(LocalDateTime.now());
        System.out.println(beginAndEndOfPrevMonth);
    }

    static DateRange getBeginAndEndOfPrevMonth(LocalDateTime dateTime) {
        final LocalDate date = dateTime.toLocalDate().minusMonths(1);
        final int lastDayOfMonth = date.getMonth().length(date.isLeapYear());
        final LocalDateTime monthEnding = date.withDayOfMonth(lastDayOfMonth)
                .atTime(LocalTime.MAX);
        LocalDateTime monthBeginning = date.withDayOfMonth(1).atStartOfDay();
        return new DateRange(monthBeginning, monthEnding);
    }

    record DateRange(
            LocalDateTime from,
            LocalDateTime to,
            Period period
    ) {

        DateRange(LocalDateTime from, LocalDateTime to) {
            this(from, to, calculatePeriod(from, to));
        }

        private static Period calculatePeriod(LocalDateTime from, LocalDateTime to) {
            return Period.between(from.toLocalDate(), to.toLocalDate());
        }
    }
}
