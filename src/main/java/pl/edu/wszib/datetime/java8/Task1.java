package pl.edu.wszib.datetime.java8;

import java.time.LocalDateTime;

public class Task1 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Year: " + localDateTime.getYear());
        System.out.println("Month: " +localDateTime.getMonth());
        System.out.println("Day: " + localDateTime.getDayOfMonth());
        System.out.println("Hour: " + localDateTime.getHour());
        System.out.println("Minute: " + localDateTime.getMinute());
        System.out.println("Second: " + localDateTime.getSecond());
    }
}
