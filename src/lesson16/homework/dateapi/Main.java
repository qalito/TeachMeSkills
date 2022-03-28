package lesson16.homework.dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println("Now " + localDate.format(DateTimeFormatter.ofPattern("dd.MM.YYYY")));
        localDate = LocalDate.of(2022, 12, 01);
        System.out.println("localDate 01.12.2022 +3 day " + localDate.plusDays(3));
        localDate = LocalDate.ofEpochDay(1111);
        System.out.println("1111 of epoch 01.01.1970 " + localDate);
        localDate = LocalDate.ofYearDay(2012, 345);
        System.out.println("345 day 2012  " + localDate);

        System.out.println("Now " + localTime);
        localTime = LocalTime.of(23, 15, 14, 10);
        System.out.println("localTime of " + localTime);
        localTime = LocalTime.ofSecondOfDay(86399);
        System.out.println("localTime ofSecondOfDay ");
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Now " + localDateTime);
        localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}
