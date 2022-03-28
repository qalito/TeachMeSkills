package lesson16.task.localdate;

import java.time.LocalDate;

public class DateHandler {

    public static LocalDate checkExpiration(Car car) {
        return car.getCreateDate().plusYears(car.getExpirationYears());
    }

    public static boolean isAfterDate(LocalDate date, LocalDate expirationDate) {
        return date.isAfter(expirationDate);
    }

}
