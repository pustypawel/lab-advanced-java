package pl.edu.wszib.datetime.java8;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Task2 {
    public static void main(String[] args) {
        LocalDateTime newYorkDateTime = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(newYorkDateTime);
    }
}
